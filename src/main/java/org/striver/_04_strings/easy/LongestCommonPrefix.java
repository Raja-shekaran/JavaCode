package org.striver._04_strings.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] cars = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(cars));
    }
    public static String longestCommonPrefix(String[] arr) {
            Arrays.sort(arr);
            String first = arr[0];
            String last = arr[arr.length - 1];
            int minLength = Math.min(first.length(), last.length());
            int i = 0;
            while (i < minLength && first.charAt(i) == last.charAt(i)) {
                i++;
            }
            return first.substring(0, i);
        }
}
