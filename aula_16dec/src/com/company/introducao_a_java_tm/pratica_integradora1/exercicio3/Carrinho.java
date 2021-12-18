package com.company.introducao_a_java_tm.pratica_integradora1.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> listaDeProdutos = new ArrayList<>();

    public Carrinho(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public Carrinho() {
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }


    private Double getTotal(){
            double resultado = 0;
            for(Produto p: listaDeProdutos){
                resultado += p.getPreco() * p.getQuantity();
            }
            return resultado;
    }

   public void visualizarCarrinho(){
       System.out.println("=========================== CARRINHO ===========================\n");
       for(int i = 0; i< listaDeProdutos.size(); i++){
           System.out.println("Produto " + (i+1) + "\n" + listaDeProdutos.get(i) + "\n");
       }
       System.out.println("Valor Total: R$" + getTotal());
   }
}