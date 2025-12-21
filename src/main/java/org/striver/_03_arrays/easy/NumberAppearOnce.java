package org.striver._03_arrays.easy;

public class NumberAppearOnce {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int xor = 0;
        for(int num : arr){
            xor ^= num;
        }
        System.out.println(xor);
    }
}
