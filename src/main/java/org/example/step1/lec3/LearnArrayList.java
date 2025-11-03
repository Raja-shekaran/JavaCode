package org.example.step1.lec3;

import java.util.*;

/**
 * Demonstrates Java ArrayList operations and features.
 *
 * Key Concepts:
 * - Unlike arrays, ArrayLists are dynamic and can grow or shrink.
 * - They maintain insertion order and allow duplicate elements.
 * - ArrayLists are backed by resizable arrays internally.
 */
public class LearnArrayList {
    public static void main(String[] args) {

        // -----------------------------
        // Basic String List Operations
        // -----------------------------
        List<String> list = new ArrayList<>();

        list.add("Raja");
        System.out.println("Size after adding 1 element: " + list.size());

        list.add("Malik");
        System.out.println("Size after adding 2 elements: " + list.size());

        list.remove(1);
        System.out.println("Size after removing 1 element: " + list.size());

        // -----------------------------
        // Integer List Operations
        // -----------------------------
        List<Integer> numList = new ArrayList<>();
        numList.add(20);
        numList.add(30);
        System.out.println("Initial numList: " + numList);

        // Add element at specific index
        numList.add(1, 40);
        System.out.println("After adding 40 at index 1: " + numList);

        // -----------------------------
        // Creating a Copy of a List
        // -----------------------------
        List<Integer> numList2 = new ArrayList<>(numList);
        numList2.add(50);
        System.out.println("Copied list with extra element: " + numList2);

        // Modify an element using set()
        numList2.set(2, 60);
        System.out.println("After setting index 2 to 60: " + numList2);

        // Check for existence of element
        System.out.println("Contains 50? " + numList2.contains(50));

        // -----------------------------
        // Remove Operations
        // -----------------------------
        numList2.remove(0); // Removes by index
        System.out.println("After removing index 0: " + numList2);

        numList2.remove(Integer.valueOf(40)); // Removes by value
        System.out.println("After removing value 40: " + numList2);

        // Clear all elements
        numList2.clear();
        System.out.println("After clearing: " + numList2);

        // -----------------------------
        // Different Ways to Iterate
        // -----------------------------
        System.out.println("\nIteration using for loop:");
        for (int i = 0; i < numList.size(); i++) {
            System.out.println("Element at index " + i + ": " + numList.get(i));
        }

        System.out.println("\nIteration using enhanced for loop:");
        for (Integer integer : numList) {
            System.out.println("Element: " + integer);
        }

        System.out.println("\nIteration using Iterator:");
        Iterator<Integer> it = numList.iterator();
        while (it.hasNext()) {
            System.out.println("Element: " + it.next());
        }
    }
}
