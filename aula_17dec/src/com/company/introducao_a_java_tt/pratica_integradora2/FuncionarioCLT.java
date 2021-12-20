package com.company.introducao_a_java_tt.pratica_integradora2;

import java.time.LocalDate;

public abstract class FuncionarioCLT extends Funcionario {

    private Double salarioBase;
    private LocalDate dataDoUltimoPagamento;
    private Double valorDoUltimoSalarioPago;

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
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

    //    a. Técnicos recebem bonificação de 5% por meta batida, trabalham uma jornada
//    de 40h semanais e não têm descanso semanal remunerado. O salário base de
//    um técnico é de R$ 3.200.
//    b. Analistas possuem bonificação de 8% por meta batida, trabalham uma jornada
//    de 40h horas semanais e possuem 4h de descanso semanal remunerado. O
//    salário base de um analista é de R$ 4.000
//    c. Gerentes possuem bonificação de 12,5% por meta batida, trabalham 36h
//    semanais com 4h de descanso semanal remunerado. O salário base de um
//    gerente é de R$ 6.000.
//
//    d. Diretores não possuem bonificação, entretanto recebem participação nos
//    lucros de 3%, não possuem horário de trabalho definido e seu salário base é
//    de R$ 15.000.

    public FuncionarioCLT(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }



}