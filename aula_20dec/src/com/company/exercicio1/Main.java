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

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Precedente<Pessoa>> listPessoas = new ArrayList<>();

        listPessoas.add(new Pessoa("Monurla", "416.310.830-07"));
        listPessoas.add(new Pessoa("Wofoein", "501.604.480-50"));
        listPessoas.add(new Pessoa("Myowifan", "004.782.490-55"));
        listPessoas.add(new Pessoa("Lipevi", "882.128.270-89"));
        listPessoas.add(new Pessoa("Barxiout", "631.908.560-60"));
        listPessoas.add(new Pessoa("Eron", "498.069.630-91"));
        listPessoas.add(new Pessoa("Sumyekub", "014.255.970-92"));


        System.out.println("\n=====================LISTA DE PESSOAS=====================");

        System.out.println("\n+++++++++++++++++++++++NÃO ORDENADA+++++++++++++++++++++++");

            for(Precedente<Pessoa> p: listPessoas){
                System.out.println("\n" + p);
            }

        SortUtil.sort(listPessoas);
        System.out.println("\n+++++++++++++++++++++++++ORDENADA+++++++++++++++++++++++++");

        for(Precedente<Pessoa> p: listPessoas){
            System.out.println("\n" + p);
        }


        List<Precedente<Celular>> listCelulares = new ArrayList<>();

        listCelulares.add(new Celular(94324912));
        listCelulares.add(new Celular(98377261));
        listCelulares.add(new Celular(96273827));
        listCelulares.add(new Celular(91234978));
        System.out.println("\n====================LISTA DE CELULARES====================");

        System.out.println("\n+++++++++++++++++++++++NÃO ORDENADA+++++++++++++++++++++++");

        for(Precedente<Celular> c: listCelulares){
            System.out.println("\n" + c);
        }

        SortUtil.sort(listCelulares);

        System.out.println("\n+++++++++++++++++++++++++ORDENADA+++++++++++++++++++++++++");

        for(Precedente<Celular> c: listCelulares){
            System.out.println("\n" + c);
        }

    }
}
