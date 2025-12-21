package org.striver._03_arrays.easy;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr  = {8, 10, 5, 7, 9};
        int max = arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);
    }
}
