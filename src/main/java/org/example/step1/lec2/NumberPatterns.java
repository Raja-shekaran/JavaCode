package org.example.step1.lec2;

import java.util.Scanner;

public class NumberPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Binary Number Triangle Pattern
        int start = 1;
        for(int i=0;i<n;i++){
            if(i%2 ==0) start = 1;
            else start = 0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }

        //Increasing Number Triangle Pattern
        int count = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }

        //Increasing Letter Triangle Pattern
        for(int i=0;i<n;i++){
            char c ='A';
            for(int j=0;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

        //Decreasing Letter Triangle Pattern
        for(int i=0;i<n;i++){
            char c ='A';
            for(int j=i;j<n;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

        //Alpha-Ramp Pattern
        char c ='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }

        sc.close();
    }
}
