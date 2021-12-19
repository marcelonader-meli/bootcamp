package com.company.introducao_a_java_tm.exercicio;

import java.time.LocalDate;

public class Estudante {

    private String nome;
    private LocalDate dataNascimento;
    private Integer numeroMatricula;
    private String serie;

    public Estudante(String nome, LocalDate dataNascimento, Integer numeroMatricula, String serie) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroMatricula = numeroMatricula;
        this.serie = serie;
    }

    public Estudante() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "\n=================== Estudante: " + nome + " ===================\n" +
                "Data de nascimento: " + dataNascimento +
                "\nNúmero da matrícula: " + numeroMatricula +
                "\nSérie: " + serie + "\n";
    }
}
