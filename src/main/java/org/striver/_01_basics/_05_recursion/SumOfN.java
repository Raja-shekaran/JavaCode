package org.striver._01_basics._05_recursion;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sum(N,0));
        System.out.println(sumFunction(N));
    }

    //1. Parameterized way
    public static int sum(int N, int sum){
        if(N==0) return sum;
        return sum(N-1,sum+N);
    }

    //2. Functional way
    public static int sumFunction(int N){
        if(N==0) return 0;
        return N + sumFunction(N-1);
    }
}
