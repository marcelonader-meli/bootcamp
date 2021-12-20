package com.company.introducao_a_java_tt.pratica_integradora2;

import java.time.LocalDate;

public class FuncionarioPJ extends Funcionario{

    private Double valorDaHora;
    private LocalDate dataDoUltimoPagamento;
    private Double valorDoUltimoSalarioPago;

    public FuncionarioPJ(String nome, String sobrenome, String cpf, Double valorDaHora) {
        super(nome, sobrenome, cpf);
        this.valorDaHora = valorDaHora;
    }

    public Double getValorDaHora() {
        return valorDaHora;
    }

    public void setValorDaHora(Double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }

    public LocalDate getDataDoUltimoPagamento() {
        return dataDoUltimoPagamento;
    }

    public void setDataDoUltimoPagamento(LocalDate dataDoUltimoPagamento) {
        this.dataDoUltimoPagamento = dataDoUltimoPagamento;
    }

    public Double getValorDoUltimoSalarioPago() {
        return valorDoUltimoSalarioPago;
    }

    public void setValorDoUltimoSalarioPago(Double valorDoUltimoSalarioPago) {
        this.valorDoUltimoSalarioPago = valorDoUltimoSalarioPago;
    }

    public void pagarSalario(Integer horasTrabalhadas) {
        this.dataDoUltimoPagamento = LocalDate.now();
        this.valorDoUltimoSalarioPago = horasTrabalhadas * valorDaHora;
        System.out.println("Valor pago ao(à) funcionário(a) PJ " + this.getNome() + " " + this.getSobrenome() + " em " + this.getDataDoUltimoPagamento() + ": "+ valorDoUltimoSalarioPago);
    }

}
