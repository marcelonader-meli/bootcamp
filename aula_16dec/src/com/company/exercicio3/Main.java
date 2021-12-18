package com.company.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        Desenvolva um programa para informar se um um número n é primo ou não, sendo n um
        valor que o usuário irá inserir pelo console. Lembre-se que um número é primo quando só é
        divisível por 1 e por si mesmo.
*/

public class Main {

    static boolean ehPrimo(int number){
        if(number <= 1)
            return false;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número para saber se ele é primo: ");
        int numberUser = scan.nextInt();
        System.out.println(ehPrimo(numberUser));

    }
}
