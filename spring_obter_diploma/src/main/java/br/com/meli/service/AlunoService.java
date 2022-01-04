package br.com.meli.service;

import br.com.meli.dto.AlunoDTO;
import br.com.meli.dto.DiplomaDTO;
import br.com.meli.persistence.AlunoRepository;
import br.com.meli.persistence.DiplomaRepository;

import br.com.meli.persistence.entities.AlunoEntity;
import br.com.meli.persistence.entities.DiplomaEntity;
import br.com.meli.persistence.entities.DisciplinaEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
public class AlunoService {

//    @Autowired
    private AlunoRepository alunoRepository;
    private DiplomaRepository diplomaRepository;

    public AlunoService (){
        this.alunoRepository = new AlunoRepository();
        this.diplomaRepository = new DiplomaRepository();
    }
//    public Double getMedia(Integer id){
//        Double soma = alunoRepository.buscarPorId(id).getDisciplinasAprovadas().stream().map(DisciplinaEntity::getNota).reduce(0.0, (acc, crr)-> acc+crr);
//        return soma/alunoRepository.buscarPorId(id).getDisciplinasAprovadas().size();
//    }

//    public DiplomaEntity getDiploma(Integer id){
//        DiplomaEntity diplomaEntity = new DiplomaEntity();
//        DiplomaEntity diplomaRepo = diplomaRepository.getDiploma(id);
//
//        diplomaEntity.setId(diplomaRepo.getId());
//        diplomaEntity.setAluno(diplomaRepo.getAluno());
//        diplomaEntity.setMedia(diplomaRepo.getMedia());
//        if(this.getMedia(id) > 9.0)
//            diplomaEntity.setMensagem("Sua nota foi superior a 9. Parabéns!!!");
//        else
//            diplomaEntity.setMensagem("Você foi aprovado!");
//        return diplomaEntity;
//    }



    public List<AlunoEntity> buscarTodos() throws IOException {
        return alunoRepository.buscarTodos();
    }

    public AlunoEntity salvar(AlunoEntity aluno) throws IOException {
        return alunoRepository.salvar(aluno);
    }

}
