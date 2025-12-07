package org.striver.step3.lec1;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,34,56,6,67,7,77,7,67,1};
        System.out.println(linearSearch(arr,67));
    }

    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) return i;
        }
        return -1;
    }
}
