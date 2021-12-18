package com.company.introducao_a_java_tm.pratica_integradora1.exercicio1;


import java.util.Arrays;
import java.util.Collections;

/*
        Exercício 1: Dado um vetor de 10 posições, preenchido pelos valores 52, 10, 85, 1324, 01, 13,
        62, 30, 12 e 127.

            Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        Imprima no console:

        a) Sua ordenação crescente.
        b) Sua ordenação decrescente.
*/

public class Main {
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        System.out.println("======================ORDEM CRESCENTE======================\n");
        //Ordenação crescente.
        Arrays.sort(array);
        for(Integer n: array)
            System.out.println(n);

        System.out.println("\n======================ORDEM DECRESCENTE======================\n");
        //Ordenação decrescente.
        Arrays.sort(array, Collections.reverseOrder());
        for(Integer n: array)
            System.out.println(n);

    }

}
