package com.company.exercicio1;

public class Celular implements Precedente<Celular>{
    private Integer numero;
    private Pessoa proprietario;

    public Celular(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.getNumero().compareTo(celular.getNumero());
    }

    @Override
    public String toString() {
        return "Número: " + numero;
    }
}
