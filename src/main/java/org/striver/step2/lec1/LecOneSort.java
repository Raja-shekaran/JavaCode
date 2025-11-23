package org.striver.step2.lec1;

public class LecOneSort {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(arr);

        //selectionSort(arr);
        //bubbleSort(arr);
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

    public static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length-1;i++)
        {
            swapped = false;
            for(int j=0;j < arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
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
