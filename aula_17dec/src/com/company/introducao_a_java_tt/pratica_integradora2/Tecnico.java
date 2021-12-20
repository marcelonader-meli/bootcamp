package com.company.introducao_a_java_tt.pratica_integradora2;

import java.time.LocalDate;

public class Tecnico extends FuncionarioCLT{

    private static Double salarioBase = 3200.00;
    private static Double bonificacao = 0.05;
    private boolean bateuAMeta = false;
    private static boolean temDSR = false;
    private static Integer jornadaDeTrabalho = 40;

    public Tecnico(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    public void pagarSalario(boolean bateuAMeta) {
        this.bateuAMeta = bateuAMeta;
        this.setDataDoUltimoPagamento(LocalDate.now());
        if(this.bateuAMeta)
            this.setValorDoUltimoSalarioPago(salarioBase + (salarioBase*bonificacao));
        else
            this.setValorDoUltimoSalarioPago(salarioBase);
        System.out.println("Valor pago ao(à) Técnico(a) " + this.getNome() + " " + this.getSobrenome() + " em " + this.getDataDoUltimoPagamento() + ": "+ this.getValorDoUltimoSalarioPago());
    }
}
