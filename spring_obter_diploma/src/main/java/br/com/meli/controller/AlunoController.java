package br.com.meli.controller;

import br.com.meli.dto.AlunoDTO;
import br.com.meli.dto.DiplomaDTO;
import br.com.meli.persistence.AlunoRepository;
import br.com.meli.persistence.DiplomaRepository;
import br.com.meli.persistence.entities.AlunoEntity;
import br.com.meli.persistence.entities.DiplomaEntity;
import br.com.meli.persistence.entities.DisciplinaEntity;
import br.com.meli.service.AlunoService;
//import br.com.meli.service.DiplomaService;
import br.com.meli.service.DiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

//    @Autowired
    AlunoService alunoService;
//    DiplomaService diplomaService;
    DiplomaRepository diplomaRepository;
    DiplomaService diplomaService;
//    private AlunoRepository alunoRepository;
//

    public AlunoController(){
        this.alunoService = new AlunoService();
        this.diplomaRepository = new DiplomaRepository();
        this.diplomaService = new DiplomaService();
    }

    @PostMapping
    public ResponseEntity<AlunoDTO> salvar(@Valid @RequestBody AlunoEntity alunoEntity) throws IOException {
        return ResponseEntity.ok(AlunoDTO.converte(alunoService.salvar(alunoEntity)));
    }

    @GetMapping
    public ResponseEntity<List<AlunoDTO>> getAlunos() throws IOException {
            return ResponseEntity.ok(alunoService.buscarTodos().stream().map(AlunoDTO::converte).collect(Collectors.toList()));
    }

}
