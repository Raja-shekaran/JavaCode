package org.striver.step3.lec1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUnSorted {
    public static void main(String[] args) {
        int[] arr  = {3, 1, 2, 3, 4, 2};
        int noOfUnique = removeDuplicates(arr);
        System.out.println(noOfUnique);
        for (int i=0;i<noOfUnique;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDuplicates(int[] arr){
        int i = 0;
        Set<Integer> set = new HashSet<>();
        for(int j=0;j<arr.length;j++){
            if(!(set.contains(arr[j]))){
                set.add(arr[j]);
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
}
