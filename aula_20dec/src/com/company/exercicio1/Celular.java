package com.company.exercicio1;

public class Celular implements Precedente<Celular>{
    private String numero;
    private Pessoa proprietario;

    @Override
    public int precedeA(Celular celular) {
        return 0;
    }
}
