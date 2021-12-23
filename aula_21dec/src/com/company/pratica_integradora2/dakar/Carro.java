package com.company.pratica_integradora2.dakar;

public class Carro extends Veiculo{
    private static final Double PESO = 1000.0;
    private static final Integer RODAS = 4;

    public Double getPeso() {
        return PESO;
    }

    public Integer getRodas() {
        return RODAS;
    }

    public Carro(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, PESO, RODAS);
    }

    public Carro() {
        super(PESO, RODAS);
    }
}
