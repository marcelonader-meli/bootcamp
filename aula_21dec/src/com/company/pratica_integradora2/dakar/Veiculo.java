package com.company.pratica_integradora2.dakar;

public class Veiculo implements Comparable{
    private Double velocidade;
    private Double aceleracao;
    private Double anguloDeGiro;
    private String placa;
    private Double peso;
    private Integer rodas;


    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(Double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public Double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(Double anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getRodas() {
        return rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Veiculo v = (Veiculo) o;
        if((this.getVelocidade() * this.getAceleracao() / (this.getAnguloDeGiro() * (this.getPeso() - this.getRodas() * 100))) > (v.getVelocidade() * v.getAceleracao() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100)))){
            return 1;
        } else if((this.getVelocidade() * this.getAceleracao() / (this.getAnguloDeGiro() * (this.getPeso() - this.getRodas() * 100))) < (v.getVelocidade() * v.getAceleracao() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100)))){
            return -1;
        }
        return 0;
    }

}
