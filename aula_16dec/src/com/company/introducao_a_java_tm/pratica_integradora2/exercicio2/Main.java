package com.company.introducao_a_java_tm.pratica_integradora2.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e
        m valores que o usuário irá inserir via console. Lembre-se que um número a é divisível por b
        quando o resto da divisão de a por b é igual a 0.
*/

public class Main {

    static List<Integer> verificaNumerosMultiplos(int numberN, int numberM){
        List<Integer> listNumbers = new ArrayList<>();
        for(int count = 0; listNumbers.size() < numberN; count++){
            if(count % numberM == 0){
                listNumbers.add(count);
            }
        }
        return listNumbers;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Você deseja descobrir os números que sejam multiplos de qual número?");
        int numberMUser = scan.nextInt();
        System.out.print("Digite quantos número você quer que sejam devolvidos pelo Sistema: ");
        int numberNUser = scan.nextInt();
        System.out.println(verificaNumerosMultiplos(numberNUser, numberMUser));

    }
}
