package com.company.pratica_integradora2.dakar;

/*
    Execute ponto a ponto de maneira ordenada, sem pular.
    Faça os diagramas de classe correspondentes em cada etapa e faça as alterações à
    medida que resolvemos os diferentes pontos.

    1. Crie a classe do Veiculo que possui os seguintes atributos:
        ● velocidade
        ● aceleracao
        ● anguloDeGiro
        ● placa
        ● peso
        ● rodas

    2. Modele a classe Corrida que possui os seguintes atributos:
        ● distancia
        ● premioEmDolares
        ● nome
        ● quantidadeVeiculosPermitidos
        ● listaVeiculos

    3. Adicionar duas novas categorias de veículos:
        ● Carros
        ● Motos

    Os carros pesam 1.000 quilos e as motocicletas 300 quilos, os carros têm 4 rodas e as
    motocicletas 2.

    4. Uma corrida também tem um conjunto de veículos que participarão dela. Portanto,
    agora a corrida terá a responsabilidade de poder adicionar um veículo à corrida,
    portanto devemos definir os seguintes métodos:
    public void registrarCarro(velocidade, aceleracao, anguloDeGiro, patente);
    public void registrarMoto(velocidade, aceleracao, anguloDeGiro, patente);

    Ambos os métodos adicionam um veículo, desde que haja espaço.

    5. Teremos também a possibilidade de eliminar um veículo usando dois métodos:
    public void removerVeiculoo(veiculo);
    public void removerVeiculoPorPlaca(String placa);

    6. Queremos ser capazes de definir o vencedor de uma corrida:
    O vencedor será aquele com o valor máximo determinado pela seguinte fórmula:
    velocidade * aceleracao / ( anguloDeGiro * (peso - quantidadeDeRodas * 100)

    7. As corridas também contam com veículos salva-vidas que, em caso de emergência, vão
    consertar um veículo. Como os carros são muito diferentes das motocicletas, existem duas
    classes diferentes de veículos salva-vidas. Um deles só sabe ajudar carros e outro só sabe
    ajudar motocicletas.

    a) Adicione as classes
    SocorristaCarro
    SocorristaMoto
    b) Adicione os métodos:
    SocorristaCarro → public void socorrer(Carro carro)
    SocorristaMoto → public void socorrer(Moto moto)
    Quando um salva-vidas se aproxima de um carro, ele imprime “Socorrendo carro” e o
    número da patente na tela, quando ajuda uma motocicleta, ele imprime “Socorrendo moto”
    e o número da patente na tela.
    c) Adicione um salva-vidas de carro e um de moto à classe de corrida:
    b) Adicione a responsabilidade de ajudar uma motocicleta e um carro:
    public void socorrerCarro(String documento);
    public void socorrerMoto(String documento);
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Corrida corrida1 = new Corrida();

        corrida1.setQuantidadeVeiculosPermitidos(5);

        Veiculo motoCriada = new Moto(180.8, 89.5, 120.0, "GOL6587");

        corrida1.registrarCarro(240.0, 65.1, 90.0, "DAI2134");
        corrida1.registrarMoto(180.7, 105.4, 80.0, "JSA9899");
        corrida1.registrarCarro(298.0, 55.2, 96.0, "JWT2627");
        corrida1.registrarCarro(167.5, 68.0, 90.0, "FOK1235");
        corrida1.registrarMoto(motoCriada);

        corrida1.registrarCarro(180.8, 89.5, 120.0, "FRI2221");
        System.out.println("Quantidade de veículos permitidos: " +corrida1.getQuantidadeVeiculosPermitidos());

        System.out.println("\n==================LISTA DE VEÍCULOS PARTICIPANTES==================\n");
        for(Veiculo v: corrida1.getListaVeiculos())
            System.out.println(v);

        System.out.println("\nVeículo de placa FOK1235 foi colidido pelo veículo de placa GOL6587.");
        corrida1.socorrerCarro("FOK1235");

        System.out.println("Não foi possível salvar o veículo de placa FOK1235. Veículo removido da corrida.\n");
        corrida1.removerVeiculoPorPlaca("FOK1235");

        System.out.println("Veículo de placa GOL6587: desclassificado e removido da corrida.\n");

        corrida1.removerVeiculo(motoCriada);

        Veiculo veiculoVencedorDaCorrida = corrida1.getVencedor();

        System.out.println("\nVencedor da corrida: " + (veiculoVencedorDaCorrida.getRodas() == 4 ? "carro" : "moto") + " de placa " + veiculoVencedorDaCorrida.getPlaca());

    }
}
