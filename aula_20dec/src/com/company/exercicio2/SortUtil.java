package com.company.exercicio2;

import java.util.List;

public class SortUtil {

    public static <T> void sort(T arr[], Precedente<T> p) {
        //desenvolver aqui o algoritmo de bolha (bubble sort) para ordenar a matriz.
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length -1; j++){
                if(p.precedeA((T) arr[j], (T) arr[j+1]) > 0){
                    T aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                };
            }
        }
    }
}
