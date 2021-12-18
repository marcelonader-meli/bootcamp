package com.company.introducao_a_java_tm.pratica_integradora1.exercicio3;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantity;

    public Produto(String nome, Double preco, Integer quantity) {
        this.nome = nome;
        this.preco = preco;
        this.quantity = quantity;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  nome +
                "\nR$" + preco +
                "\nQuantidade: " + quantity;
    }
}
