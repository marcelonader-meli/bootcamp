package com.company.exercicio1;


/*
    1. Crie a interface Precedente<T> com um método public int precedeA (T t).

    2. Crie a classe Pessoa, com os atributos String nome e cpf, seus métodos de acesso e
    os construtores que você considera apropriados.

    3. Criar uma classe Pessoa que implemente Precedente<Pessoa>, e sobrescreva o
    método int precedeA(Pessoa p).
    4. Defina um critério de precedência para implementar o método acima. Pode ser que
    uma pessoa preceda outra se o seu CPF for inferior, ou o nome for alfabeticamente
    inferior e assim por diante.
    5. Crie a classe SortUtil com o método:
    public static <T> void sort (List<Precedente <T>> arr[ ]).

    6. Dentro do método anterior, desenvolva o algoritmo de bolha (bubble sort) para
    ordenar a matriz.

    7. Discussão: O método de classificação pode classificar uma matriz de qualquer tipo de
    dados?

    8. Crie um programa, declare um array com várias pessoas, classifique-o e exiba-o.
    9. Crie a classe Celular, com os atributos: numero e proprietario, implemente
    Precedente<Celular> e proceda da mesma forma que fizemos com Pessoa do ponto
    anterior.
*/

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Precedente<Pessoa>> listPessoas = new ArrayList<>();

        listPessoas.add(new Pessoa("Marcelo", 123123));
        listPessoas.add(new Pessoa("Paulo", 323123));
        listPessoas.add(new Pessoa("Rita", 243123));

//        SortUtil.sort(listPessoas);


    }
}
