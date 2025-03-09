package org.example;

public class SwapNumbers {

    //How do you swap two numbers without using a third variable in Java?
    public static void main(String[] args) {
        int a = 1 , b = 3;
        b = b + a;
        a = b - a;
        b = b - a;
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
        System.out.println(a +"" +b);
    }
}
