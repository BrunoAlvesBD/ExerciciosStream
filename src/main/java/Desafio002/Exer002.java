package main.java.Desafio002;

import java.util.Arrays;
import java.util.List;

public class Exer002 {
    public Exer002() {
    }

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //utilizando stream.filter para separar os valores pares e reduce com Method reference para somar.
        int result = (Integer) numeros.stream().filter((n) -> {
            return n % 2 == 0;
        }).reduce(0, Integer::sum);
        System.out.println(result);
    }
}
