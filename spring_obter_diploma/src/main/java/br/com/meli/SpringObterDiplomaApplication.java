package br.com.meli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringObterDiplomaApplication {

/*    É necessário desenvolver uma API que receba um aluno que contenha o seu "nome",
    e todas as disciplinas aprovadas com "nome" e "nota", é necessário calcular a média
    das notas obtidas ao longo do curso e gerar o diploma com uma “mensagem”,
            “média” e “aluno”.
    Se a média do aluno for superior a 9, deve ser reconhecido com um parabéns.*/

    public static void main(String[] args) {
        SpringApplication.run(SpringObterDiplomaApplication.class, args);


    }

}
