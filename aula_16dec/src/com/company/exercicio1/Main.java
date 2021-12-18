package com.company.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor
        que o usuário irá inserir pelo console. Lembre-se que um número é par quando divisível por 2.
*/

public class Main {

    static List<Integer> verificaNumerosPares(int number){
        List<Integer> listNumbers = new ArrayList<>();
        int count = 0;
        while(listNumbers.size() < number){
            if(count % 2 == 0)
                listNumbers.add(count);
            count++;
        }
        return listNumbers;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numberUser = scan.nextInt();
        System.out.println(verificaNumerosPares(numberUser));
    }
}
