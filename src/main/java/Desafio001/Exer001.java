package main.java.Desafio001;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

//Crie um programa que utilize
// a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
public class Exer001 {
    public static void main(String[] args) {
        //recebendo a lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //agora com o stream.sorted ele já coloca os valores em ordem crescente
        //com o ForEach com o Consumer para imprimir os valores.
        numeros.stream().sorted().forEach(System.out::println);
    }
}