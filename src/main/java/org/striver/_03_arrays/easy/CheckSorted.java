package org.striver._03_arrays.easy;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,5,6};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(!(arr[i+1] >= arr[i])){
                return false;
            }
        }
        return true;
    }
}
