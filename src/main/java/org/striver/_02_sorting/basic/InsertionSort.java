package org.striver._02_sorting.basic;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(arr);

        insertionSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }

    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
