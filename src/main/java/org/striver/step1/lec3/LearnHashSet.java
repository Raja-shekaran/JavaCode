package org.striver.step1.lec3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Demonstrates different Set implementations in Java.
 *
 * Key Idea:
 * - A Set in Java is a collection that does NOT allow duplicate elements.
 * - It is used to store unique values such as IDs, usernames, etc.
 *
 * Common Implementations:
 * - HashSet: Unordered, uses hashing for fast access.
 * - LinkedHashSet: Maintains insertion order.
 * - TreeSet: Stores elements in sorted order.
 */
public class LearnHashSet {
    public static void main(String[] args) {

        // --------------------------------
        // Choose one implementation:
        // --------------------------------
        // Set<Integer> set = new HashSet<>();         // ❌ No order
        // Set<Integer> set = new LinkedHashSet<>();   // 🔁 Maintains insertion order
        Set<Integer> set = new TreeSet<>();            // 🔼 Sorted order

        // --------------------------------
        // Basic Operations
        // --------------------------------
        set.add(32);
        set.add(32); // duplicate ignored
        set.add(22);
        set.add(12);
        set.add(42);
        set.add(92);

        System.out.println("Initial Set: " + set);

        // Remove element
        set.remove(22);
        System.out.println("After removing 22: " + set);

        // Check if an element exists
        System.out.println("Contains 42? " + set.contains(42));

        // Check if empty
        System.out.println("Is set empty? " + set.isEmpty());

        // Size of set
        System.out.println("Size of set: " + set.size());

        // Clear all elements
        set.clear();
        System.out.println("After clearing: " + set);
    }
}
