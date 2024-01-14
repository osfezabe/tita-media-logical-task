package com.titamedia.logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejercicio6 {

    public static void main(String[] args) {
        String[] input = new String[]{
                "abc", "ujk", "zzy", "ahj", "aaz", "oip"
        };

        List<String> sorted = sortStrings(input);
        System.out.println(sorted);

    }

    private static List<String> sortStrings(String[] input) {
        return Arrays.stream(input)
                .sorted(Comparator.comparingInt(Ejercicio6::sumValues))
                .toList();
    }

    private static int sumValues(String string) {
        return string.chars().sum();
    }
}
