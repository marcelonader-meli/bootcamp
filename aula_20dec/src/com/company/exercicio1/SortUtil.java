package com.company.exercicio1;

import java.util.List;

public class SortUtil {

    public static <T> void sort(List<Precedente<T>> arr) {
        //desenvolver aqui o algoritmo de bolha (bubble sort) para ordenar a matriz.
        for(int i=0; i< arr.size()-1; i++){
            for(int j=0; j< arr.size() -1; j++){
                if(arr.get(j).precedeA((T) arr.get(j+1)) > 0){
                    Precedente<T> aux = arr.get(j);
                    arr.remove(j);
                    arr.add(j+1, aux);
                };
            }
        }
    }
}
