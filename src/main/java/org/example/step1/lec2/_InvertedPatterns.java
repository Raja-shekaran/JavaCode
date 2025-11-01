package org.example.step1.lec2;

import java.util.Scanner;

public class _InvertedPatterns {
    public static void main(String[] args) {
        char c = '*';
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Pattern-5: Inverted Right Pyramid
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(c);
            }
            System.out.println();
        }
        //Pattern - 6: Inverted Numbered Right Pyramid
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
