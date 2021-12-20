package com.company.exercicio1;

public class Pessoa implements Precedente<Pessoa>{
    private String nome;
    private Integer cpf;

    public Pessoa(String nome, Integer cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        if(this.getCpf() > pessoa.getCpf())
            return 1;
        if(this.getCpf() < pessoa.getCpf())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
