package com.company.exercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Celular implements Precedente<Celular>{
    private String numero;
    private Pessoa proprietario;

    public Celular(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public int precedeA(Celular celular) {
        Pattern pattern = Pattern.compile("[0-9]");
        String numThisCelular = "";
        String numParamCelular = "";

        for(int i = 0; i< this.getNumero().length(); i++){
            Matcher matcher = pattern.matcher(String.valueOf(this.getNumero().charAt(i)));
            if(matcher.find())
                numThisCelular += this.getNumero().charAt(i);
        }

        for(int i = 0; i< celular.getNumero().length(); i++){
            Matcher matcher = pattern.matcher(String.valueOf(this.getNumero().charAt(i)));
            if(matcher.find())
                numParamCelular += celular.getNumero().charAt(i);
        }

        return numThisCelular.compareTo(numParamCelular);
    }

    @Override
    public String toString() {
        return "Número: " + numero;
    }
}
