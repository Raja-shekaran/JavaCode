package org.striver._02_sorting.advanced;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 4,6,2,5,7,9,1,3,8,10 };

        System.out.print("Original array: ");
        printArray(arr);

        quickSort(arr, 0, arr.length-1);

        System.out.print("Sorted array: ");
        printArray(arr);
    }

    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int partitionIndex = getPartitionIndex(arr, low, high);
            quickSort(arr, low, partitionIndex);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    public static int getPartitionIndex(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j)
        {
            while (arr[i] < pivot && i < high) {
                i++;
            }

            while (arr[j] > pivot && j > low) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return j;
    }

    public static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
