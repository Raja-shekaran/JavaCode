package org.example;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(findSecondHighest(array));

        Arrays.sort(array);
        System.out.println(array[array.length - 2]);
    }

    private static int findSecondHighest(int[] array) {
        int high = Integer.MIN_VALUE;
        int low = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > high) {
                low = high;
                high = i;
            } else if (i > low) {
                low = i;
            }
        }
        return low;
    }
}
