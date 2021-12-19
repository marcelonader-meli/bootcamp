package com.company.introducao_a_java_tt.exercicio2;

public class Utilidade {
    public static double areaMedia(FiguraGeometrica[] arr){
        double somaDasFiguras = 0;
        for(FiguraGeometrica figura: arr){
            somaDasFiguras+= figura.area();
        }
        return somaDasFiguras/arr.length;
    }
}
