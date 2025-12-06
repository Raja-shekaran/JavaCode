package org.striver.step3.lec1;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr  = {8, 10, 5, 7, 9};
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for(int num: arr){
            if(num < min){
                secondMin = min;
                min = num;
            }else if(num < secondMin && num > min){
                secondMin=num;
            }
        }
        System.out.println(secondMin);
    }
}
