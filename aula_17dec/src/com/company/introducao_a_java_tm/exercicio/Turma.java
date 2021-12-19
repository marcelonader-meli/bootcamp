package com.company.introducao_a_java_tm.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String serie;
    private String codigoIdentificador;
    private List<Disciplina> vetorDeDisciplinas = new ArrayList<>();
    private List<Estudante> vetorDeEstudantes = new ArrayList<>();

    public Turma(String serie, String codigoIdentificador, List<Disciplina> vetorDeDisciplinas, List<Estudante> vetorDeEstudantes) {
        this.serie = serie;
        this.codigoIdentificador = codigoIdentificador;
        this.vetorDeDisciplinas = vetorDeDisciplinas;
        this.vetorDeEstudantes = vetorDeEstudantes;
    }

    public Turma(String serie, String codigoIdentificador) {
        this.serie = serie;
        this.codigoIdentificador = codigoIdentificador;
    }

    public Turma() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public List<Disciplina> getVetorDeDisciplinas() {
        return vetorDeDisciplinas;
    }

    public List<Estudante> getVetorDeEstudantes() {
        return vetorDeEstudantes;
    }

}
