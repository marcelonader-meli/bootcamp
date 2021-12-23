package br.com.meli.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConversorService {

    private static String auxConverteNumerosIntermediarios(int num, int numFor, int comparador, String resultIfEElseParam2, String resultElseParam1){
        StringBuilder result = new StringBuilder();
        if (num < comparador) {
            result.append(String.valueOf(resultIfEElseParam2).repeat(Math.max(0, numFor)));
        } else {
            result = new StringBuilder(resultElseParam1);
            result.append(String.valueOf(resultIfEElseParam2).repeat(Math.max(0, numFor - 5)));
        }
        return result.toString();
    }
    private static String converteNumerosIntermediarios(Integer num){
        Map<Integer, String> mapaNumerosMagicos = new HashMap<>();
        mapaNumerosMagicos.put(1, "I");mapaNumerosMagicos.put(4, "IV");mapaNumerosMagicos.put(5, "V");
        mapaNumerosMagicos.put(9, "IX");mapaNumerosMagicos.put(10, "X");mapaNumerosMagicos.put(40, "XL");
        mapaNumerosMagicos.put(50, "L");mapaNumerosMagicos.put(90, "XC");mapaNumerosMagicos.put(100, "C");
        mapaNumerosMagicos.put(400, "CD");mapaNumerosMagicos.put(500, "D");mapaNumerosMagicos.put(900, "CM");
        mapaNumerosMagicos.put(1000, "M");

        StringBuilder result = new StringBuilder();
        int dig = countDigits(num);

        if (mapaNumerosMagicos.get(num) != null) {
            result = new StringBuilder(mapaNumerosMagicos.get(num));
            return result.toString();
        }
        final int numTratado = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(0)));
        switch (dig){
            case 1:
                return auxConverteNumerosIntermediarios(num, num,5, "I", "V");
            case 2:
                return auxConverteNumerosIntermediarios(num, numTratado, 50, "X", "L");
            case 3:
                return auxConverteNumerosIntermediarios(num, numTratado, 500, "C", "D");
            case 4:
                if(num <= 3000) {
                    result.append("M".repeat(Math.max(0, numTratado)));
                    return result.toString();
                } else {
                    return null;
                }
        }
        return null;
    }

    private static String auxConverteNumeroDecParaRomano(String[] list, int count){
        StringBuilder result = new StringBuilder();
        int contador = count;
        if(count == 1000){
            for (String s : list) {
                    if (converteNumerosIntermediarios(Integer.parseInt(s) * contador) != null)
                        result.append(converteNumerosIntermediarios(Integer.parseInt(s) * contador));
                    else
                        return null;
                    contador /= 10;
            }
            System.out.println(result);
            return result.toString();
        }
        for (String s : list) {
            result.append(converteNumerosIntermediarios(Integer.parseInt(s) * contador));
            contador /= 10;
        }
        System.out.println(result);
        return result.toString();
    }

    private static int countDigits ( int number){
        return (number == 0)
                ? 1
                : (int) (Math.log10(number) + 1);
    }

    public String converteNumeroDecParaRomano(Integer num) {
        int dig = countDigits(num);

        switch (dig) {
            case 1:
                System.out.println(converteNumerosIntermediarios(num));
                return converteNumerosIntermediarios(num);
            case 2:
                String[] listNumbersCase2 = String.valueOf(num).split("");
                return auxConverteNumeroDecParaRomano(listNumbersCase2, 10);
            case 3:
                String[] listNumbersCase3 = String.valueOf(num).split("");
                return auxConverteNumeroDecParaRomano(listNumbersCase3, 100);
            case 4:
                String[] listNumbersCase4 = String.valueOf(num).split("");
                return auxConverteNumeroDecParaRomano(listNumbersCase4, 1000);
        }
        return null;
    }
}

