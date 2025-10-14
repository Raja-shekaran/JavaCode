package org.example.step1.lec1;

import java.util.Scanner;

public class _1_UserInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNumber(sc);
    }

    public static void printNumber(Scanner sc) {
        System.out.println("Enter an number");
        int number = sc.nextInt();
        System.out.println(number);
    }
}
