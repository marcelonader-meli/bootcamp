package com.company.exercicio2;


/*
    Discussão: se quisermos mudar o critério de precedência entre duas pessoas ou dois
    celulares, o que devemos fazer? Quão extensível e sustentável é a solução de ordenação
    que desenvolvemos no exercício anterior? Como poderia ser melhorado?
*/

//ALTERA O MÉTODO SORT DA CLASSE SORTUTIL PARA QUE ELE RECEBA UMA FUNÇÃO LAMBDA COMO PARÂMTRO E TORNE DINÂMICA A ESCOLHA DA ORDENAÇÃO

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static <Lista> void main(String[] args) {

        Pessoa p1 = new Pessoa("Wofoein", "501.604.480-50");
        Pessoa p2 = new Pessoa("Myowifan", "004.782.490-55");
        Pessoa p3 = new Pessoa("Lipevi", "882.128.270-89");
        Pessoa p4 = new Pessoa("Barxiout", "631.908.560-60");
        Pessoa p5 = new Pessoa("Eron", "498.069.630-91");
        Pessoa p6 = new Pessoa("Sumyekub", "014.255.970-92");
        Pessoa p7 = new Pessoa("Monurla", "416.310.830-07");

        Pessoa[] list = {p1,p2,p3,p4,p5,p6,p7};

        System.out.println("\n===================ORDENAR POR NOME===================\n");
        SortUtil.sort(list,(a,b)->a.getNome().compareTo(b.getNome()));

        for(Pessoa p: list){
            System.out.println(p + "\n");
        }

        System.out.println("===================ORDENAR POR CPF===================\n");

        Precedente<Pessoa> comparaCPF = (a, b) -> { Pattern pattern = Pattern.compile("[0-9]");
            String[] arrNumACPF = a.getCpf().split("");
            String[] arrNumBCPF = b.getCpf().split("");

            String nA = Arrays.stream(arrNumACPF)
                    .reduce("", (acc, crr) -> {
                        Matcher matcher = pattern.matcher(String.valueOf(crr));
                        if (matcher.find())
                            acc += crr;
                        return acc;
                    });

            String nB = Arrays.stream(arrNumBCPF)
                    .reduce("", (acc, crr) -> {
                        Matcher matcher = pattern.matcher(String.valueOf(crr));
                        if (matcher.find())
                            acc += crr;
                        return acc;
                    });

            return nA.compareTo(nB);
        };

        SortUtil.sort(list,comparaCPF);

        for(Pessoa p: list){
            System.out.println(p + "\n");
        }
    }
}
