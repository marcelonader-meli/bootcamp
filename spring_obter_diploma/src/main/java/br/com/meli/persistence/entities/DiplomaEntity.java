package br.com.meli.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class DiplomaEntity {

    private AlunoEntity aluno;
    private BigDecimal media;
    private String mensagem;

}
