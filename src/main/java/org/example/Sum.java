package org.example;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.stream(array).sum());
    }
}
