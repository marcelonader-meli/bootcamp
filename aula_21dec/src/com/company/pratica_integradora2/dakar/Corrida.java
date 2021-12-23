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
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;


    public Corrida(){
        this.socorristaCarro = new SocorristaCarro();
        this.socorristaMoto = new SocorristaMoto();
    }

    public Corrida(Double distancia, Double premioEmDolares, String nome, Integer quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.socorristaCarro = new SocorristaCarro();
        this.socorristaMoto = new SocorristaMoto();
    }

    public Integer getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setQuantidadeVeiculosPermitidos(Integer quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public void registrarCarro(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa){
        Veiculo carro = VeiculoFactory.getVeiculo(4);
        carro.setVelocidade(velocidade);
        carro.setAceleracao(aceleracao);
        carro.setAnguloDeGiro(anguloDeGiro);
        carro.setPlaca(placa);
        if(listaVeiculos.size() < this.quantidadeVeiculosPermitidos)
            listaVeiculos.add(carro);
        else
            System.out.println("\nNão foi possível registrar o carro de placa: " + carro.getPlaca() + ". Não há mais vagas para participar da corrida.\n");

    }

    public void registrarCarro(Veiculo carro){
        if(listaVeiculos.size() < this.quantidadeVeiculosPermitidos)
            listaVeiculos.add(carro);
        else
            System.out.println("\nNão foi possível registrar o carro de placa: " + carro.getPlaca() + ". Não há mais vagas para participar da corrida.\n");
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
            System.out.println("\nNão foi possível registrar a moto de placa: " + moto.getPlaca() + ". Não há mais vagas para participar da corrida.\n");
    }
    public void registrarMoto(Veiculo moto){
        if(listaVeiculos.size() < this.quantidadeVeiculosPermitidos)
            listaVeiculos.add(moto);
        else
            System.out.println("\nNão foi possível registrar o carro de placa: " + moto.getPlaca() + ". Não há mais vagas para participar da corrida.\n");
    }
    public void removerVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa){
        listaVeiculos.removeIf(l -> l.getPlaca().equals(placa));
    }

    public Veiculo getVencedor(){
        Veiculo vencedor = null;
        if(!listaVeiculos.isEmpty()) {
            double result = 0.0;
            for (Veiculo v : listaVeiculos) {
                    if (result < (v.getVelocidade() * 1 / 2 * v.getAceleracao() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100)))) {
                        result = (v.getVelocidade() * 1 / 2 * v.getAceleracao() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100)));
                        vencedor = v;
                    }
            }
        }
        return vencedor;
    }

    public void socorrerCarro(String placa){
        for(Veiculo v: listaVeiculos){
            if(v.getPlaca().equals(placa)&&(v instanceof Carro)){
                socorristaCarro.socorrer((Carro) v);
                return;
            }
        }
        System.out.println("\nCarro não encontrado!\n");
    }

    public void socorrerMoto(String placa){
        for(Veiculo v: listaVeiculos){
            if(v.getPlaca().equals(placa)&&(v instanceof Moto)){
                socorristaMoto.socorrer((Moto) v);
                return;
            }
        }
        System.out.println("\nCarro não encontrado!\n");
    }
}
