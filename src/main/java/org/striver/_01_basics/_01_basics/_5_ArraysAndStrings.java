package org.striver._01_basics._01_basics;

import java.util.Scanner;

public class _5_ArraysAndStrings {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        //2D Array
        int[][] array = new int[3][2];
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<2;j++)
            {
                array[i][j]=sc.nextInt();
            }

        }
        for (int i = 0;i<3;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.println(array[i][j]);
            }
        }

        //Strings
        String str = "Raja";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1 ));
    }
}
