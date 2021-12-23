package com.company.pratica_integradora2.dakar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Corrida {
    private Double distancia;
    private Double premioEmDolares;
    private String nome;
    private Integer quantidadeVeiculosPermitidos;
    private final List<Veiculo> listaVeiculos = new ArrayList<>();

    public Integer getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(Integer quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public void registrarCarro(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa){
        Veiculo carro = VeiculoFactory.getVeiculo(4);
        assert carro != null;
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
        assert moto != null;
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
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa){
        listaVeiculos.removeIf(l -> l.getPlaca().equals(placa));
    }

    public void getVencedor(){
//        listaVeiculos.stream().reduce(0, (acc,crr)->
//                        System.out.println(acc);
//            System.out.println(crr.getVelocidade() * crr.getAceleracao() / ( crr.getAnguloDeGiro() * (crr.getPeso() - crr.getRodas() * 100)));
//        );
        for(Veiculo v:listaVeiculos)
            System.out.println(v);
        Collections.sort(listaVeiculos, (a,b)-> a.compareTo(b));
        for(Veiculo v:listaVeiculos)
            System.out.println(v);


    }

}
