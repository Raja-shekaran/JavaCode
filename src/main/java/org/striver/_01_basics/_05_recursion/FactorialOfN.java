package org.striver._01_basics._05_recursion;

import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fact(N,1));
        System.out.println(factFunction(N));
    }

    //1. Parameterized way
    public static int fact(int N, int fact){
        if(N==0 || N==1) return fact;
        return fact(N-1, fact*N);
    }

    //2. Functional way
    public static int factFunction(int N){
        if(N==0 || N==1) return N;
        return N * factFunction(N-1);
    }

}
