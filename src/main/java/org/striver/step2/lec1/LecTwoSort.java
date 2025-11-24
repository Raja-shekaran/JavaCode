package org.striver.step2.lec1;

public class LecTwoSort {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(arr);

        mergeSort(arr,0,arr.length-1);

        System.out.print("Sorted array: ");
        printArray(arr);

        int[] arr2 = { 4,6,2,5,7,9,1,3,8,10 };

        System.out.print("Original array: ");
        printArray(arr2);

        quickSort(arr2, 0, arr2.length-1);

        System.out.print("Sorted array: ");
        printArray(arr2);
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


    public static void mergeSort(int[] arr, int low, int high) {
        if (low == high) return;

        int mid = ( low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int index = 0;

        // Merge until one side is exhausted
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        // Leftover left half
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        // Leftover right half
        while (right <= high) {
            temp[index++] = arr[right++];
        }

        // Copy back to original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
