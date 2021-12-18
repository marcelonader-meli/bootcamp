package com.company.pratica_arrays.exercicio2;

import java.time.LocalDate;

public class Empresa {
    private String nome;
    private Double valorDaEmpresa;
    private Integer anoDaAvaliacao;
    private Double taxaMediaDeCrescimentoAnual;

    public Double calcularCrescimento(){
        this.valorDaEmpresa += taxaMediaDeCrescimentoAnual / 100 * valorDaEmpresa;
        return valorDaEmpresa;
    }

    public Empresa(String nome, Double valorDaEmpresa, Integer anoDaUltimaAvaliacao, Double taxaMediaDeCrescimentoAnual) {
        this.nome = nome;
        this.valorDaEmpresa = valorDaEmpresa;
        this.anoDaAvaliacao = anoDaUltimaAvaliacao;
        this.taxaMediaDeCrescimentoAnual = taxaMediaDeCrescimentoAnual;
    }

    public Empresa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorDaEmpresa() {
        return valorDaEmpresa;
    }

    public void setValorDaEmpresa(Double valorDaEmpresa) {
        this.valorDaEmpresa = valorDaEmpresa;
    }

    public Integer getAnoDaAvaliacao() {
        return anoDaAvaliacao;
    }

    public void setAnoDaAvaliacao(Integer anoDaUltimaAvaliacao) {
        this.anoDaAvaliacao = anoDaUltimaAvaliacao;
    }

    public Double getTaxaMediaDeCrescimentoAnual() {
        return taxaMediaDeCrescimentoAnual;
    }

    public void setTaxaMediaDeCrescimentoAnual(Double taxaMediaDeCrescimentoAnual) {
        this.taxaMediaDeCrescimentoAnual = taxaMediaDeCrescimentoAnual;
    }
}
