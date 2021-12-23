package com.company.pratica_integradora2.dakar;

public class Moto extends Veiculo{
    private static final Double PESO = 300.0;
    private static final Integer RODAS = 2;

    public Double getPeso() {
        return PESO;
    }

    public Integer getRodas() {
        return RODAS;
    }

    public Moto (Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, PESO, RODAS);
    }
    public Moto() {
        super(PESO, RODAS);
    }
}
