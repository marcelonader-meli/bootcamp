package br.com.meli.persistence.entities;

import br.com.meli.dto.AlunoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class AlunoEntity {

    private Integer id;
    private String nome;
    private List<DisciplinaEntity> disciplinasAprovadas;

}
