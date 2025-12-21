package org.striver._03_arrays.easy;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr  = {8, 10, 5, 7, 9};
        int min = arr[0];
        for(int num: arr){
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
