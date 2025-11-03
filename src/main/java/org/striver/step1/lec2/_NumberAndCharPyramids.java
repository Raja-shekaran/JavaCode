package org.striver.step1.lec2;

import java.util.Scanner;

public class _NumberAndCharPyramids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Alpha-Hill Pattern
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            char c = 'A';
            int breakpoint = (2*i+1)/2;
            for(int k=0;k<2*i+1;k++)
            {
                System.out.print(c);
                if(k < breakpoint) c++;
                else c--;
            }
            for(int l=0;l<n-i;l++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
