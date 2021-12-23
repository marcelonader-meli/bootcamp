package com.company.pratica_integradora2.dakar;

import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private Double distancia;
    private Double premioEmDolares;
    private String nome;
    private Integer quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos = new ArrayList<>();

    public void registrarCarro(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa){
        Veiculo carro = VeiculoFactory.getVeiculo(4);
        carro.setVelocidade(velocidade);
        carro.setAceleracao(aceleracao);
        carro.setAnguloDeGiro(anguloDeGiro);
        carro.setPlaca(placa);
        if(listaVeiculos.size() < this.quantidadeVeiculosPermitidos)
            listaVeiculos.add(carro);
        else
            System.out.println("Não foi possível registrar o veículo. Não há mais vagas para participar da corrida.");

    }
    public void registrarMoto(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa){
        Veiculo moto = VeiculoFactory.getVeiculo(2);
        moto.setVelocidade(velocidade);
        moto.setAceleracao(aceleracao);
        moto.setAnguloDeGiro(anguloDeGiro);
        moto.setPlaca(placa);
        if(listaVeiculos.size() < this.quantidadeVeiculosPermitidos)
            listaVeiculos.add(moto);
        else
            System.out.println("Não foi possível registrar o veículo. Não há mais vagas para participar da corrida.");
    }

    public void removerVeiculo(Veiculo veiculo){

    }

    public void removerVeiculoPorPlaca(String placa){

    }

}
