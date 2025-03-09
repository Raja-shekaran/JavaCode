package org.example;

public class Fibonacci {
    public static void printFibonacciSequence(int count) {
        int a = 0, b = 1;
        System.out.print(a);

        for (int i = 1; i < count; i++) {
            System.out.print(", " + b);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        printFibonacciSequence(10);
    }
}
