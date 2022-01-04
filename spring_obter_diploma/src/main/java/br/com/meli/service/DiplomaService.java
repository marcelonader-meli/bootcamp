package br.com.meli.service;
import br.com.meli.persistence.DiplomaRepository;
import br.com.meli.persistence.entities.DiplomaEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class DiplomaService {

    private DiplomaRepository diplomaRepository;
//    private AlunoService alunoService;

    public DiplomaService(){
        this.diplomaRepository = new DiplomaRepository();
//        this.alunoService = new AlunoService();
    }

    public DiplomaEntity pegarDiploma(Integer alunoId) throws IOException {
        return diplomaRepository.pegarDiploma(alunoId);
    }

    public List<DiplomaEntity> buscarTodos() throws IOException {
        return diplomaRepository.buscarTodos();
    }
}
