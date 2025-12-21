package org.striver._03_arrays.medium;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1};
        Arrays.sort(arr);
        int longest = 1 ,lastSmaller = Integer.MIN_VALUE, countCurrent = 0;
        for (int j : arr) {
            if (j - 1 == lastSmaller) {
                countCurrent++;
                lastSmaller = j;
            } else if (j != lastSmaller) {
                countCurrent = 1;
                lastSmaller = j;
            }
            longest = Math.max(longest, countCurrent);
        }
        System.out.println(longest);
    }
}
