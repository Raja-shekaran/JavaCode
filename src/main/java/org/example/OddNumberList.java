package org.example;

import java.util.*;

public class OddNumberList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println(onlyOdd(numbers));
    }

    public static boolean onlyOdd(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0)
                return false;
        }
        return true;

        //return numbers.stream().allMatch(n -> n % 2 != 0);
    }
}
