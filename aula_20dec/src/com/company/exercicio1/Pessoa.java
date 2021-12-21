package com.company.exercicio1;

public class Pessoa implements Precedente<Pessoa>{
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
    public int precedeA(Pessoa pessoa) {
        return this.getNome().compareTo(pessoa.getNome());
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                "\nCPF: " + cpf;
    }
}
