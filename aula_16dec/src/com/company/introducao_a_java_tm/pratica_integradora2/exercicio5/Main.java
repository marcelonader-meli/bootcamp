package com.company.introducao_a_java_tm.pratica_integradora2.exercicio5;

/*
        Desenvolver um programa para exibição por console os n primeiros números naturais que
        têm pelo menos m dígitos de d, sendo n, m e d valores que o utilizador vai informar pelo
        console.
        Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5
        números naturais que tenham pelo menos 2 dígitos terminados em 3 no console. Neste
        caso, a saída será: 33, 133 , 233, 303, 313.
        Dependendo de como você decidir abordar a solução para este exercício, pode ser
        necessário usar recursos que ainda não estudamos. Faz parte do desafio encontrar
        soluções na Internet e utilizá-las.
*/

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int countDigits (int number) {
        return (number == 0)
            ? 1
            : (int)(Math.log10(number) + 1);
    }

static List<Integer> listNaturalNumbers(int n, int m, int d) {
    List<Integer> listNumbers = new LinkedList<>();
    int count = 0;
    int initiatorNumber = 1;
    if (m != 1) {
        while (countDigits(count) != m)
            count++;
        initiatorNumber = count;
    }
    for (int i = initiatorNumber; listNumbers.size() < n; i++) {
        if((String.valueOf(i).endsWith(String.valueOf(d))))
            listNumbers.add(i);
        else
            continue;
    }
    return listNumbers;
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite quantos números naturais você quer que terminem com determinado número: ");
        int numberNUser= scan.nextInt();
        System.out.print("Digite o mínimo de dígitos que cada número deverá ter: ");
        int numberMUser = scan.nextInt();
        System.out.print("Digite o número que você quer que cada um dos números termine: ");
        int numberDUser = scan.nextInt();
        System.out.println(listNaturalNumbers(numberNUser, numberMUser, numberDUser));
    }
}
