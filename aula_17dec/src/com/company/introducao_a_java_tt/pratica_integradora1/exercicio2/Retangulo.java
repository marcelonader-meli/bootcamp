package com.company.introducao_a_java_tt.pratica_integradora1.exercicio2;

public class Retangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura;
    }
}
