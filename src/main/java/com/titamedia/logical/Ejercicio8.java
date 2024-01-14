package com.titamedia.logical;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Algoritmo para brindar solución a la fórmula f(n) = -1 + 2 - 3 + ... + [(-1)^n * n]");
        System.out.println();
        System.out.print("Por favor ingrese el parámetro de entrada: ");
        int n = scanner.nextInt();
        if (n > 0) {
            int result = sumNumbers(n, 0, 1, -1);
            System.out.println("El resultado es " + result);
        } else {
            System.out.println("Por favor ingrese un número entero positivo");
        }
    }

    private static int sumNumbers(int limit, int sum, int position, int sign) {
        if (position > limit) {
            return sum;
        }

        return sumNumbers(limit, sum + (position * sign), position + 1, -1 * sign);
    }
}
