package br.com.meli.dto;

import br.com.meli.persistence.entities.AlunoEntity;
import br.com.meli.persistence.entities.DisciplinaEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class AlunoDTO {


    @NotNull(message = "O nome do Aluno é obrigatório.")
    @Pattern(regexp = "[a-zA-Z ]{8,50}", message = "Para o nome do aluno devem ser observadas as seguintes regras: apenas caracteres de a-z, mínimo 8 e máximo 50 caracteres.")
    private String nome;

    @NotNull(message = "A lista de disciplinas é obrigatória.")
    private List<DisciplinaDTO> disciplinasAprovadasDTO = new ArrayList<>();


    public static AlunoDTO converte(AlunoEntity alunoEntity){
        List<DisciplinaDTO> disciplinasDTO = alunoEntity.getDisciplinasAprovadas().stream().map(DisciplinaDTO::converte).collect(Collectors.toList());
        return new AlunoDTO(alunoEntity.getNome(), disciplinasDTO);
    }
}
