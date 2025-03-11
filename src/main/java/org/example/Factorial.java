package org.example;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    public static long factorial(long num) {
        if (num == 1 || num == 0)
            return 1;
        else
            return (num * factorial(num - 1));
    }
}
