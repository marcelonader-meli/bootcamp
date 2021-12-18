package com.company.pratica_arrays.exercicio2;


import java.util.Arrays;
import java.util.Collections;

/*
        Exercício 2: Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em
        R$ 1,13 milhão e possui uma média de crescimento anual de 148%. Uma concorrente do ramo,
        “Empresa Y”, é avaliada em R$ 18,4 milhões e com sua média de crescimento anual em 32%.

            Empresa X - 01/01/2021 - Valor da empresa: 1,13m
            Empresa Y - 01/01/2021 - Valor da empresa: 18,4m

        Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual até que a
        empresa X ultrapasse a empresa Y em seu valor de mercado.
*/

public class Main {
    public static void main(String[] args) {

        int ano = 2021;
        Empresa empresaX = new Empresa ("Empresa X", 1.13, 2021, 148.0);
        Empresa empresaY = new Empresa ("Empresa Y", 18.4, 2021, 32.0);

        for(int i = ano; empresaX.getValorDaEmpresa() < empresaY.getValorDaEmpresa(); ano++){
            if(ano == empresaX.getAnoDaAvaliacao()){
                continue;
            }
            empresaX.calcularCrescimento();
            empresaY.calcularCrescimento();
            empresaX.setAnoDaAvaliacao(empresaX.getAnoDaAvaliacao() + 1);
            empresaY.setAnoDaAvaliacao(empresaY.getAnoDaAvaliacao() + 1);
            System.out.println("\n================== ANO DA AVALIAÇÃO: "+ (empresaX.getAnoDaAvaliacao())+" ==================\n");
            System.out.printf("%s - 01/01/%d - Valor da empresa: %.2fm%n", empresaX.getNome(), ano, empresaX.getValorDaEmpresa());
            System.out.printf("%s - 01/01/%d - Valor da empresa: %.2fm%n", empresaY.getNome(), ano, empresaY.getValorDaEmpresa());
        }
        System.out.println("\n++++++++++++++++ RESULTADO FINAL DA ANÁLISE ++++++++++++++++\n");
        System.out.printf("A previsão é que a %s ultrapasse a %s em seu valor de mercado no ano %d", empresaX.getNome(), empresaY.getNome(), ano-1);
    }

}
