package com.company.exercicio1;

import java.util.Arrays;
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

    String[] arrNumThisCelular = this.getNumero().split("");
    String[] arrNumParamCelular = celular.getNumero().split("");

    String nThis = Arrays.stream(arrNumThisCelular)
            .reduce("", (acc,crr) ->  {
                Matcher matcher = pattern.matcher(String.valueOf(crr));
                    if(matcher.find())
                        acc += crr;
                    return acc;});

    String nParam = Arrays.stream(arrNumParamCelular)
            .reduce("", (acc,crr) ->  {
                        Matcher matcher = pattern.matcher(String.valueOf(crr));
                        if(matcher.find())
                            acc += crr;
                        return acc;});

    return nThis.compareTo(nParam);
}

    @Override
    public String toString() {
        return "Número: " + numero;
    }
}
