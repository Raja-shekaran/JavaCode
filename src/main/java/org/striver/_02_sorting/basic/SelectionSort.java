package org.striver._02_sorting.basic;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex]) minIndex = j;
            }
            int  temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
