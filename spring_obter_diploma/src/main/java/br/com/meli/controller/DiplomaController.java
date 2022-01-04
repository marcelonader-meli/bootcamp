package br.com.meli.controller;

import br.com.meli.dto.DiplomaDTO;
import br.com.meli.persistence.DiplomaRepository;
import br.com.meli.persistence.entities.AlunoEntity;
import br.com.meli.persistence.entities.DiplomaEntity;
import br.com.meli.service.AlunoService;
import br.com.meli.service.DiplomaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/diploma")
public class DiplomaController {

//    @Autowired
    AlunoService alunoService;
//    DiplomaService diplomaService;
    DiplomaRepository diplomaRepository;
    DiplomaService diplomaService;
//    private AlunoRepository alunoRepository;
//

    public DiplomaController(){
        this.alunoService = new AlunoService();
        this.diplomaRepository = new DiplomaRepository();
        this.diplomaService = new DiplomaService();
    }

    @GetMapping("/{alunoId}")
    public ResponseEntity<DiplomaDTO> buscarPorAlunoId(
            @PathVariable Integer alunoId
    ) throws IOException {
            return ResponseEntity.ok(DiplomaDTO.converte(diplomaService.pegarDiploma(alunoId)));
    }

    @GetMapping
    public ResponseEntity<?> buscarTodos() throws IOException {
        return ResponseEntity.ok(diplomaService.buscarTodos().stream().map(DiplomaDTO::converte).collect(Collectors.toList()));
    }
}
