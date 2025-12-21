package org.striver._03_arrays.easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int max = 0;
        int count = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
