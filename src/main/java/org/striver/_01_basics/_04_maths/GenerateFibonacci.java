package org.striver._01_basics._04_maths;

public class GenerateFibonacci {
    public static void main(String[] args) {
        int a=0, b=1, n=5;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++){
            int next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }
    }
}
