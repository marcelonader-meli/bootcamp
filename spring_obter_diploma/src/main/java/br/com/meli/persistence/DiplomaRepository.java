package br.com.meli.persistence;

import br.com.meli.persistence.entities.AlunoEntity;
import br.com.meli.persistence.entities.DiplomaEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class DiplomaRepository {

    List<DiplomaEntity> listDiplomas = new ArrayList<>();

    private final List<DiplomaEntity> diplomaList = new ArrayList<>();
    private final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    private final String PATH = "src/main/resources/diplomas.json";

    public List<DiplomaEntity> buscarTodos() throws IOException{
        return Arrays.stream(mapper.readValue(Paths.get(this.PATH).toFile(), DiplomaEntity[].class))
                            .collect(Collectors.toList());
    }

    public DiplomaEntity pegarDiploma(Integer alunoId) throws IOException {
        return Arrays.stream(mapper.readValue(Paths.get(this.PATH).toFile(), DiplomaEntity[].class))
                .filter(diploma -> diploma.getAluno().getId().equals(alunoId)).findFirst().orElse(null);
    }

    public void salvar(DiplomaEntity diplomaEntity) throws IOException {
        this.createFile();
        diplomaList.add(diplomaEntity);
        mapper.writeValue(new File(PATH), diplomaList);
    }

    public void createFile() throws IOException {
        mapper.writeValue(new File(this.PATH), diplomaList);
    }

}
