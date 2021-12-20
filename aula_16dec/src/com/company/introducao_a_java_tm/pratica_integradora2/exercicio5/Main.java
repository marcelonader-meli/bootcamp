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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

static List<Integer> listNaturalNumbers(int n, int m, int d) {
    List<Integer> listNumbers = new LinkedList<>();
    int count = 0;
    Pattern pattern = Pattern.compile("" + d + "");

    for (int i = 0; listNumbers.size() < n; i++) {
        Matcher matcher = pattern.matcher(String.valueOf(i));
        count=0;
        while (matcher.find()) count++;
        if(String.valueOf(i).endsWith(String.valueOf(d)) && count == m)
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
