package org.striver.step3.lec1;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;

        //Temp for storing k elements
        int[] temp = new int[k];
        for(int i=0;i<k;i++) temp[i]=arr[n-k+i];

        System.out.println(Arrays.toString(temp));

        //Shifting start from k index
        for(int i=n-1;i>=k;i--){
            arr[i] = arr[i-k];
        }

        //re-add num from temp
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));

    }
}
