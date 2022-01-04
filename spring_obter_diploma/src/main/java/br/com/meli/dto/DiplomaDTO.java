package br.com.meli.dto;

import br.com.meli.persistence.entities.AlunoEntity;
import br.com.meli.persistence.entities.DiplomaEntity;
import br.com.meli.service.DiplomaService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class DiplomaDTO {

    private AlunoEntity aluno;
    private BigDecimal media;
    private String mensagem;

    public static DiplomaDTO converte(DiplomaEntity diplomaEntity) {
       return new DiplomaDTO(diplomaEntity.getAluno(), diplomaEntity.getMedia(), diplomaEntity.getMensagem());
    }
}
