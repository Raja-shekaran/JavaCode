package org.example;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] arr = {30, 40, 10, 210, 100, 20, 90};
        int target = 40;
        System.out.println(linearSearch(arr, target));
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, target));
    }

    public static int linearSearch(int arr[], int target) {
        int index = 0;
        for (int num : arr) {
            if (num == target) return index;
            index++;
        }
        return -1;
    }

    public static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == arr[mid])
                return mid;
            if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }
}
