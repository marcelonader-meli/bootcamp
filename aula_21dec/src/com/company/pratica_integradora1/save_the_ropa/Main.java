package com.company.pratica_integradora1.save_the_ropa;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    List<Vestuario> listaVestuarios1 = Arrays.asList(new Vestuario("Nike", "Camiseta Regata"), new Vestuario("Nike", "Bermuda Jeans"));
    List<Vestuario> listaVestuarios2 = Arrays.asList(new Vestuario("Adidas", "Camiseta Esporte"), new Vestuario("C&A", "Camiseta Manga Longa"));
    List<Vestuario> listaVestuarios3 = Arrays.asList(new Vestuario("Renner", "Calça Moletom"), new Vestuario("Riachuello", "Bermuda Praia"));

    GuardaRoupa guardaRoupa = new GuardaRoupa();

    guardaRoupa.guardarVestuarios(listaVestuarios1);
    guardaRoupa.guardarVestuarios(listaVestuarios2);
    guardaRoupa.guardarVestuarios(listaVestuarios3);

    guardaRoupa.mostrarVestuarios();

    System.out.println("\n=================PESQUISA POR ID=================\n");
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o ID da Lista de Roupas: ");
    Integer entradaUser = scan.nextInt();
    System.out.println(guardaRoupa.devolverVestuarios(entradaUser));
    }
}
