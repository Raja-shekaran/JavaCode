package org.striver._01_basics._06_hashing;

import java.util.*;

/**
 * FrequencyOfElement
 * -------------------
 * Demonstrates two approaches to find:
 *  - Frequency of each element
 *  - Highest frequency element
 *  - Lowest frequency element
 *
 * Approaches:
 *  1️⃣ Using array-based hashing (for small integer values)
 *  2️⃣ Using HashMap (for any integer values)
 *
 * Author: Sudharshini
 * GitHub: https://github.com/<your-username>/DSA-Java-Repo
 */
public class FrequencyOfElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};

        System.out.println("=== Approach 1: Using Array-based Hashing ===");
        frequencyUsingArrayHashing(arr);

        System.out.println("\n=== Approach 2: Using HashMap ===");
        frequencyUsingMap(arr);
    }

    /**
     * Approach 1:
     * Uses a fixed-size array for hashing.
     * Works only for small, non-negative integers.
     */
    private static void frequencyUsingArrayHashing(int[] arr) {
        int[] hash = new int[100000];

        // Count frequencies
        for (int num : arr) {
            hash[num]++;
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxElem = -1;
        int minElem = -1;
        boolean[] printed = new boolean[hash.length];

        System.out.println("Frequencies:");
        for (int num : arr) {
            if (!printed[num]) {
                System.out.println(num + " → " + hash[num]);
                printed[num] = true;

                if (hash[num] > maxFreq) {
                    maxFreq = hash[num];
                    maxElem = num;
                }
                if (hash[num] < minFreq) {
                    minFreq = hash[num];
                    minElem = num;
                }
            }
        }

        System.out.println("Most frequent element: " + maxElem + " (Count: " + maxFreq + ")");
        System.out.println("Least frequent element: " + minElem + " (Count: " + minFreq + ")");
    }

    /**
     * Approach 2:
     * Uses a HashMap for counting frequencies.
     * Works for any integer range (positive or negative).
     */
    private static void frequencyUsingMap(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        freqMap.forEach((key, value) -> System.out.println(key + " → " + value));

        // Find highest and lowest frequency elements
        Map.Entry<Integer, Integer> maxEntry = Collections.max(freqMap.entrySet(), Map.Entry.comparingByValue());
        Map.Entry<Integer, Integer> minEntry = Collections.min(freqMap.entrySet(), Map.Entry.comparingByValue());

        System.out.println("Most frequent element: " + maxEntry.getKey() + " (Count: " + maxEntry.getValue() + ")");
        System.out.println("Least frequent element: " + minEntry.getKey() + " (Count: " + minEntry.getValue() + ")");
    }
}
