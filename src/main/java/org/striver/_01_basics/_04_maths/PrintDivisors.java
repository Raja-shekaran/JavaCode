package org.striver._01_basics._04_maths;

public class PrintDivisors {
    public static void main(String[] args) {
        int n = 36;
        for (int i = 1; i <= n ; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }

        //i*i <= n or i <= Math.sqrt(n)
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if((n%i)==0){
                System.out.println(i);
                if((n/i)!=i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}
