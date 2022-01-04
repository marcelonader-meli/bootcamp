package br.com.meli.dto;

import br.com.meli.persistence.entities.DisciplinaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class DisciplinaDTO {

    @NotNull(message = "O nome da disciplina é obrigatório.")
    @Pattern(regexp = "[a-zA-Z ]{8,50}", message = "Para o nome de cada disciplina devem ser observadas as seguintes regras: apenas caracteres de a-z, mínimo 8 e máximo 50 caracteres.")
    private String nome;

    @NotNull(message = "A nota é obrigatória.")
    @Pattern(regexp = "[0-9]{1,2}", message = "Para a nota de cada disciplina devem ser observadas as seguintes regras: apenas números de 0-9, mínimo 1 e máximo 2 caracteres.")
    private BigDecimal nota;

    public static DisciplinaDTO converte(DisciplinaEntity disciplinaEntity){
        return new DisciplinaDTO(disciplinaEntity.getNome(), disciplinaEntity.getNota());
    }
}
