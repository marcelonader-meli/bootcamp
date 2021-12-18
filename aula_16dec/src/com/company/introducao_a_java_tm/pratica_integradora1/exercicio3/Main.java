package com.company.introducao_a_java_tm.pratica_integradora1.exercicio3;

public class Main {
    /*
        Exercício 3: Para um protótipo de supermercado, crie um programa que leia 3 produtos e
        imprima no console: nome, preço, quantidade e o valor total da compra. Utilize um array como
        estrutura de dados para armazenamento dos produtos informados.

        Produto 1
        Arroz
        R$10.99
        Quantidade: 2

        Produto 2
        Feijão
        R$14.49
        Quantidade: 1

        Produto 3
        Tomate
        R$9.99
        Quantidade: 5

        Valor Total: R$86.42
    */

    public static void main(String[] args) {

        Carrinho carrinhoDeCompras = new Carrinho();
        Produto produto1 = new Produto("Arroz", 10.99, 2);
        Produto produto2 = new Produto("Feijão", 14.99, 1);
        Produto produto3 = new Produto("Tomate", 9.99, 5);

        carrinhoDeCompras.getListaDeProdutos().add(produto1);
        carrinhoDeCompras.getListaDeProdutos().add(produto2);
        carrinhoDeCompras.getListaDeProdutos().add(produto3);

        carrinhoDeCompras.visualizarCarrinho();
    }
}
