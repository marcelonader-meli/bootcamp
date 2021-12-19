package com.company.introducao_a_java_tm.exercicio;

import com.company.introducao_a_java_tm.exercicio.Disciplina;
import com.company.introducao_a_java_tm.exercicio.Estudante;
import com.company.introducao_a_java_tm.exercicio.Turma;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Estudante estudante1 = new Estudante("Roberto", LocalDate.parse("20/10/2002", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 123423, "9 ano");

        Estudante estudante2 = new Estudante("Simone", LocalDate.parse("13/04/2008", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 352137, "5 ano");

        Estudante estudante3 = new Estudante("Livia", LocalDate.parse("07/11/2005", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 433476, "7 ano");

        Estudante estudante4 = new Estudante("Rodrigo", LocalDate.parse("14/08/2005", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 562424, "7 ano");

        Disciplina portugues = new Disciplina("Português", 340);
        Disciplina matematica = new Disciplina("Matemática", 340);
        Disciplina historia = new Disciplina("História", 220);
        Disciplina educacaoFisica = new Disciplina("Educação Física", 130);

        Turma turma1 = new Turma("9 ano", "A");
        Turma turma2 = new Turma("7 ano", "C");
        Turma turma3 = new Turma("5 ano", "B");

        turma1.getVetorDeDisciplinas().add(portugues);
        turma1.getVetorDeDisciplinas().add(matematica);
        turma1.getVetorDeDisciplinas().add(historia);
        turma1.getVetorDeEstudantes().add(estudante1);

        turma2.getVetorDeDisciplinas().add(portugues);
        turma2.getVetorDeDisciplinas().add(matematica);
        turma2.getVetorDeDisciplinas().add(educacaoFisica);
        turma2.getVetorDeEstudantes().add(estudante3);
        turma2.getVetorDeEstudantes().add(estudante4);

        turma3.getVetorDeDisciplinas().add(portugues);
        turma3.getVetorDeDisciplinas().add(educacaoFisica);
        turma3.getVetorDeEstudantes().add(estudante2);

        System.out.println("\n+++++++++++++++++++++ LISTA DE ESTUDANTES - TURMA 1 +++++++++++++++++++++\n" + turma1.getVetorDeEstudantes());
        System.out.println("\n+++++++++++++++++++++ LISTA DE ESTUDANTES - TURMA 2 +++++++++++++++++++++\n" + turma2.getVetorDeEstudantes());
        System.out.println("\n+++++++++++++++++++++ LISTA DE ESTUDANTES - TURMA 3 +++++++++++++++++++++\n" + turma3.getVetorDeEstudantes());

        System.out.println("\n+++++++++++++++++++++ LISTA DE DISCIPLINAS - TURMA 1 ++++++++++++++++++++\n" + turma1.getVetorDeDisciplinas());
        System.out.println("\n+++++++++++++++++++++ LISTA DE DISCIPLINAS - TURMA 2 ++++++++++++++++++++\n" + turma2.getVetorDeDisciplinas());
        System.out.println("\n+++++++++++++++++++++ LISTA DE DISCIPLINAS - TURMA 3 ++++++++++++++++++++\n" + turma3.getVetorDeDisciplinas());
    }
}
