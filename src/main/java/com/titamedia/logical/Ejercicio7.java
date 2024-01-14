package com.titamedia.logical;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Integer[] input = new Integer[]{1, 4, 6, 7, 8, 8, 127, 89};

        var scanner = new Scanner(System.in);
        System.out.println("Vector original: " + Arrays.toString(input));
        System.out.println("Por favor escriba la cantidad de vectores deseados: ");
        int numberOfVectors = scanner.nextInt();

        if (input.length % numberOfVectors == 0) {
            Integer[][] output = splitVector(input, numberOfVectors);
            System.out.println("Vectores resultado: ");
            Arrays.stream(output).map(Arrays::toString).forEach(System.out::print);
        } else {
            System.out.println("No es posible dividir el vector en la cantidad de elementos indicado.");
        }
    }

    private static Integer[][] splitVector(Integer[] input, int numberOfVectors) {
        int size = input.length / numberOfVectors;
        Integer[][] output = new Integer[numberOfVectors][size];

        for (int index = 0; index < input.length; index++) {
            int i = index / size;
            int j = index % size;
            output[i][j] = input[index];
        }

        return output;
    }

}
