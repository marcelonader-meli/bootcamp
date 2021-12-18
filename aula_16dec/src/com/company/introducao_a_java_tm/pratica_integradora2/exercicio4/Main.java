package com.company.introducao_a_java_tm.pratica_integradora2.exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Desenvolva um programa para mostrar no console os primeiros n números primos entre 1
    e m, sendo m um valor que o usuário irá inserir pelo console.
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

    static List<Integer> listaNumerosPrimos(int numberM){
        List<Integer> listNumbers = new ArrayList<>();
        for(int count = 2; listNumbers.size() < numberM; count++){
            if(ehPrimo(count))
                listNumbers.add(count);
        }
        return listNumbers;
    }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Digite quantos números primos você quer que sejam devolvidos pelo Sistema: ");
            int numberUser = scan.nextInt();
            System.out.println(listaNumerosPrimos(numberUser));

        }

}
