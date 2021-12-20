package com.company.introducao_a_java_tt.pratica_integradora2;


/*
    1. Você recebeu a solicitação para desenvolver um sistema de gerenciamento de
    funcionários em uma empresa. Pela escala hierárquica temos dois tipos de
    funcionários, CLT e PJ. Funcionários PJ são prestadores de serviços e recebem por
    hora trabalhada. Funcionários CLT recebem de acordo com o cargo que ocupam na
    empresa + Bônus e gratificações que são calculados em porcentagem do salário
    base. Em geral Funcionários CLT são divididos na seguinte hierarquia: Técnicos,
    analistas, gerentes e diretores
    a. Técnicos recebem bonificação de 5% por meta batida, trabalham uma jornada
    de 40h semanais e não têm descanso semanal remunerado. O salário base de
    um técnico é de R$ 3.200.
    b. Analistas possuem bonificação de 8% por meta batida, trabalham uma jornada
    de 40h horas semanais e possuem 4h de descanso semanal remunerado. O
    salário base de um analista é de R$ 4.000
    c. Gerentes possuem bonificação de 12,5% por meta batida, trabalham 36h
    semanais com 4h de descanso semanal remunerado. O salário base de um
    gerente é de R$ 6.000.

    d. Diretores não possuem bonificação, entretanto recebem participação nos
    lucros de 3%, não possuem horário de trabalho definido e seu salário base é
    de R$ 15.000.

    2. Você precisa implementar o método pagarSalario para cada categoria de forma a
    considerar as especificidades de cada uma.
*/

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico1 = new Tecnico("Marcelo", "Nader", "312.312.312-31");
        Tecnico tecnico2 = new Tecnico("Felipe", "Conceição", "312.312.312-31");

        Analista analista1 = new Analista("Rafael", "Oliveira", "312.312.312-31");
        Analista analista2 = new Analista("Paula", "da Silva", "312.312.312-31");
        Analista analista3 = new Analista("Gabriela", "da Rocha", "312.312.312-31");

        Gerente gerente1 = new Gerente("Kenyo", "Faria", "312.312.312-31");
        Gerente gerente2 = new Gerente("Joice", "Lima", "312.312.312-31");

        Diretor diretor1 = new Diretor("Mauri", "Klein", "312.312.312-31");
        Diretor diretor2 = new Diretor("Michelle", "de Souza", "312.312.312-31");

        FuncionarioPJ pj1 = new FuncionarioPJ("Rodrigo", "Araújo", "312.312.312-31", 35.00);
        FuncionarioPJ pj2 = new FuncionarioPJ("Giselle", "Camargo", "312.312.312-31", 67.00);
        FuncionarioPJ pj3 = new FuncionarioPJ("Paulo", "Rogério", "312.312.312-31", 29.00);


        System.out.println("======================META BATIDA======================");

        System.out.println("\n++++++++++++++++++++++++TÉCNICOS+++++++++++++++++++++++\n");
        tecnico1.pagarSalario(true);
        tecnico2.pagarSalario(true);

        System.out.println("\n+++++++++++++++++++++++ANALISTAS+++++++++++++++++++++++\n");
        analista1.pagarSalario(true);
        analista2.pagarSalario(true);
        analista3.pagarSalario(true);

        System.out.println("\n+++++++++++++++++++++++GERENTES+++++++++++++++++++++++\n");
        gerente1.pagarSalario(true);
        gerente2.pagarSalario(true);

        System.out.println("\n\n=====================META NÃO BATIDA====================");

        System.out.println("\n++++++++++++++++++++++++TÉCNICOS+++++++++++++++++++++++\n");
        tecnico1.pagarSalario(false);
        tecnico2.pagarSalario(false);

        System.out.println("\n+++++++++++++++++++++++ANALISTAS+++++++++++++++++++++++\n");
        analista1.pagarSalario(false);
        analista2.pagarSalario(false);
        analista3.pagarSalario(false);

        System.out.println("\n+++++++++++++++++++++++GERENTES+++++++++++++++++++++++\n");
        gerente1.pagarSalario(false);
        gerente2.pagarSalario(false);

        System.out.println("\n================PAGAMENTO DOS DIRETORES===============\n");

        diretor1.pagarSalario(500000.00);
        diretor2.pagarSalario(270000.00);


        System.out.println("\n=============PAGAMENTO DOS FUNCIONÁRIOS PJ============\n");

        pj1.pagarSalario(220);
        pj2.pagarSalario(195);
        pj3.pagarSalario(180);



    }
}
