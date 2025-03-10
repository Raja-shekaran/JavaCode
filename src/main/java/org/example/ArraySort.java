package org.example;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1, -2, 4};

        //Arrays.sort(array);
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }

        for (int j = 0; j < array.length - 1; j++)
        {
            if (array[j] > array[j + 1])
            {
                // Checking the condition for two
                // simultaneous elements of the array
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;

                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                j = -1;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
