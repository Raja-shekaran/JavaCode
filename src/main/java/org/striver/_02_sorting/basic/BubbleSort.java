package org.striver._02_sorting.basic;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Original array: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
