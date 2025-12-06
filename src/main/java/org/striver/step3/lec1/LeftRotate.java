package org.striver.step3.lec1;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;

        //Temp for storing k elements
        int[] temp = new int[k];
        for(int i=0;i<k;i++) temp[i]=arr[i];

        //Shifting start from k index
        for(int i=k;i<n;i++){
            arr[i-k] = arr[i];
        }

        //re-add num from temp
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[i] = temp[j];
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
