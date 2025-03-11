package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueElements {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 2, 1};
        int[] a2 = {1, 2, 3};
        int[] a3 = {1, 2, 3, 4};

        System.out.println(uniqueElements(a1, a2)); // true
        System.out.println(uniqueElements(a1, a3)); // false
    }

    public static boolean uniqueElements(int[] array1, int[] array2) {
        Set<Integer> uniqueElements1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> uniqueElements2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());
        return uniqueElements1.equals(uniqueElements2);
    }
}
