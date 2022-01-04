package br.com.meli.persistence;

import br.com.meli.persistence.entities.AlunoEntity;
import br.com.meli.persistence.entities.DiplomaEntity;
import br.com.meli.persistence.entities.DisciplinaEntity;
import br.com.meli.service.AlunoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
@Repository
public class AlunoRepository {
    private final List<AlunoEntity> alunoList = new ArrayList<>();
    private final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    private final String PATH = "src/main/resources/alunos.json";


    //    @Autowired
//    private final DisciplinaRepository disciplinaRepository;
    private final DiplomaRepository diplomaRepository;

    public AlunoRepository() {
//        this.disciplinaRepository = new DisciplinaRepository();
        this.diplomaRepository = new DiplomaRepository();
    }

    public List<AlunoEntity> buscarTodos() throws IOException {
            return Arrays.stream(mapper.readValue(Paths.get(this.PATH).toFile(), AlunoEntity[].class))
                            .collect(Collectors.toList());
    }

    public AlunoEntity salvar(AlunoEntity alunoEntity) throws IOException {
        this.createFile();
        alunoEntity.setId(alunoList.size()+1);

        BigDecimal soma = alunoEntity.getDisciplinasAprovadas().stream().map(DisciplinaEntity::getNota).reduce(BigDecimal.valueOf(0.0), BigDecimal::add);
        BigDecimal media = soma.divide(
                BigDecimal.valueOf(alunoEntity.getDisciplinasAprovadas().size()));
        DiplomaEntity diplomaEntity = new DiplomaEntity();
        diplomaEntity.setAluno(alunoEntity);
        diplomaEntity.setMedia(media);
        diplomaEntity.setMensagem(media.compareTo(BigDecimal.valueOf(9.0)) > 0
                ? "Parabéns. Sua média final foi superior a 9!!!"
                : "Aprovado com média " + media);

        alunoList.add(alunoEntity);
        mapper.writeValue(new File(PATH), alunoList);
        diplomaRepository.salvar(diplomaEntity);
        return alunoEntity;
    }

    public void createFile() throws IOException {
        mapper.writeValue(new File(this.PATH), alunoList);
    }
}
