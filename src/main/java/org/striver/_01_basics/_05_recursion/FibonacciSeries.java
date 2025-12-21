package org.striver._01_basics._05_recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int N=5;
        System.out.println("Parameterized Way:");
        fib(0, 1, N);

        System.out.println("\nFunctional Way:");
        for (int i = 0; i < N; i++) {
            System.out.print(fibFunction(i) + " ");
        }
    }

    //1. Parameterized way
    public static void fib(int first, int second, int N) {
        if (N == 0) return;  // base case
        System.out.print(first + " ");
        fib(second, first + second, N - 1);
    }

    //2. Functional way
    public static int fibFunction(int N) {
        if (N <= 1) return N; // base case
        return fibFunction(N - 1) + fibFunction(N - 2);
    }
}
