package com.company.introducao_a_java_tt.pratica_integradora1.exercicio2;

public abstract class FiguraGeometrica {

    public abstract double area ();

    public void imprimirArea(){
        System.out.println("Área da figura: " + area());
    }
}
