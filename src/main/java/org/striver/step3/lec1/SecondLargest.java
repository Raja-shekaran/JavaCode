package org.striver.step3.lec1;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr  = {8, 10, 5, 7, 9};
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            } else if(num > secondMax && num < max){
                secondMax = num;
            }
        }
        System.out.println(secondMax);
    }
}
