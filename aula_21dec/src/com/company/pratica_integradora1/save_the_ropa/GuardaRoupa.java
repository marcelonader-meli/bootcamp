package com.company.pratica_integradora1.save_the_ropa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> dicionario = new HashMap<>();
    private static Integer contador = 1;

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        int chaveDoDicionario = contador;
        dicionario.put(contador++, listaDeVestuario);
        System.out.println("Roupas guardadas sob o ID: " + chaveDoDicionario);
        return chaveDoDicionario;
    }

    public void mostrarVestuarios(){
        for(Map.Entry<Integer, List<Vestuario>> entry: dicionario.entrySet()){
            Integer key = entry.getKey();
            List<Vestuario> value = entry.getValue();
            System.out.println("\nID: " + key + "\n" + value);
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id){
        return dicionario.get(id);
    }

}
