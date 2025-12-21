package org.striver._01_basics._02_patterns;

import java.util.Scanner;

public class _Pyramids {
    public static void main(String[] args) {
        char c = '*';
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Pattern - 7: Star Pyramid
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print(c);
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //Pattern - 8: Inverted Star Pyramid
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n - (2*i+1);j++){
                System.out.print(c);
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //Pattern - 9: Diamond Star Pattern - combination of upper 2
        //Pattern - 10: Half Diamond Star Pattern
        for(int i=1;i<=2*n-1;i++){
            // stars would be equal to the row no. untill first half
            int stars = i;

            // for the second half of the rotated triangle.
            if(i>n) stars = 2*n-i;

            // for printing the stars in each row.
            for(int j=0;j<stars;j++){
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
