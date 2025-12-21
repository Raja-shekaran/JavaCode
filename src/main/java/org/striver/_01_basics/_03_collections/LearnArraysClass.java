package org.striver._01_basics._03_collections;

import java.util.Arrays;

// Demonstration of the java.util.Arrays Utility Class in Java.
// The Arrays class provides static methods to manipulate arrays (sorting, searching, filling, comparing, etc.)
public class LearnArraysClass {
    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1️⃣ Array Initialization
        // ----------------------------------------------------
        int[] a = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};

        // ----------------------------------------------------
        // 2️⃣ Sorting Arrays
        // ----------------------------------------------------
        Arrays.sort(a); // Default ascending order sort
        System.out.println("Sorted array (ascending): " + Arrays.toString(a));

        // Sort in descending order using a custom comparator (requires wrapper class)
        Integer[] b = {5, 3, 7, 1, 4};
        Arrays.sort(b, (x, y) -> y - x); // descending order
        System.out.println("Sorted array (descending): " + Arrays.toString(b));

        // ----------------------------------------------------
        // 3️⃣ Binary Search
        // ----------------------------------------------------
        int index = Arrays.binarySearch(a, 4); // works only on sorted arrays
        System.out.println("Index of element '4': " + index);

        // ----------------------------------------------------
        // 4️⃣ Comparing Arrays
        // ----------------------------------------------------
        int[] x = {1, 2, 3};
        int[] y = {1, 2, 3};
        int[] z = {1, 3, 2};
        System.out.println("x equals y? " + Arrays.equals(x, y)); // true
        System.out.println("x equals z? " + Arrays.equals(x, z)); // false

        // ----------------------------------------------------
        // 5️⃣ Filling Arrays
        // ----------------------------------------------------
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 10);
        System.out.println("Filled array: " + Arrays.toString(fillArray));

        // ----------------------------------------------------
        // 6️⃣ Copying Arrays
        // ----------------------------------------------------
        int[] copied = Arrays.copyOf(a, 5); // copy first 5 elements
        System.out.println("Copied first 5 elements: " + Arrays.toString(copied));

        int[] copiedRange = Arrays.copyOfRange(a, 2, 7); // elements from index 2 to 6
        System.out.println("Copied range (2-6): " + Arrays.toString(copiedRange));

        // ----------------------------------------------------
        // 7️⃣ Printing Elements (Traditional Loop)
        // ----------------------------------------------------
        System.out.println("\nPrinting elements using loop:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
