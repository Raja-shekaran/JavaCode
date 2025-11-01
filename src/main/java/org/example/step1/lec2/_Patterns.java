package org.example.step1.lec2;

import java.util.Scanner;

public class _Patterns {
    public static void main(String[] args) {
        char c = '*';
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Pattern-1: Rectangular Star Pattern
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c);
            }
            System.out.println();
        }
        //Pattern-2: Right-Angled Triangle Pattern
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c);
            }
            System.out.println();
        }
        //Pattern - 3: Right-Angled Number Pyramid
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        //Pattern - 4: Right-Angled Number Pyramid - II
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
