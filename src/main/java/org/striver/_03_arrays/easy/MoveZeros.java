package org.striver._03_arrays.easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr  = {1, 0, 2, 0, 3};
        //Move Zeros
        int i = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[i++]=arr[j];
            }
        }
        for (int j=i;j<arr.length;j++) arr[j] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
