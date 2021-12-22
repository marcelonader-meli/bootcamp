package com.company.exercicio2;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                "\nCPF: " + cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
