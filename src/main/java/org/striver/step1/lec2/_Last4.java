package org.striver.step1.lec2;

import java.util.Scanner;

public class _Last4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Symmetric-Void Pattern
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for (int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Symmetric-Butterfly Pattern
        for (int i = 1; i <= 2 * n; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n - stars);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //Hollow Rectangle Pattern
        for(int i=0;i<n;i++)
        {
                for(int j=0;j<n;j++)
                {
                    if(i==0 || i == n-1)
                        System.out.print("*");
                    else if(j == 0 || j == n - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            System.out.println();
        }

        //The Number Pattern
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
                {
                    // Initialising the top, down, left and right indices of a cell.
                    int right = (2*n - 2) - j;
                    int left = (2*n - 2) - i;

                    // Min of 4 directions and then we subtract from n
                    // because previously we would get a pattern whose border
                    // has 0's, but we want with border N's and then decrease inside.
                    System.out.print(n- Math.min(Math.min(i, j), Math.min(left,right)) + " ");
                }
            System.out.println();
        }

    }
}
