package org.striver._01_basics._02_patterns;

import java.util.Scanner;

public class _NumberPatterns {
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

        //Alpha-Triangle Pattern
        for(int i=0;i<n;i++){
            for(char ch = (char) ('A'+n-1-i); ch<=(char) ('A'+n-1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        //Number Crown Pattern
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(j+1);
            }
            for(int j=0;j<2*(n-1-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }

        sc.close();
    }
}
