package com.company.pratica_integradora2.dakar;

public class VeiculoFactory {

    public static Veiculo getVeiculo(int quantidadeRodas) {
        if(quantidadeRodas == 2){
            return new Moto();
        }
        if(quantidadeRodas == 4){
            return new Carro();
        }
        return null;
    }
}
