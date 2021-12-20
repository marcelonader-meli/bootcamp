package com.company.introducao_a_java_tt.pratica_integradora1.exercicio2;

public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo(double r){
        this.raio=r;
    }
    @Override
    public double area() {
        return Math.PI*Math.pow(raio,2);
    }
}
