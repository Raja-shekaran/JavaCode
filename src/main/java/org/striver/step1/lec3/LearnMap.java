package org.striver.step1.lec3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Demonstration of Map Interface in Java using HashMap and TreeMap.
// A Map stores key-value pairs, where keys are unique.
// Common Implementations:
//   - HashMap: Unordered, allows one null key and multiple null values.
//   - TreeMap: Sorted by key (natural ordering or custom Comparator), no null keys allowed.
public class LearnMap {
    public static void main(String[] args) {

        // --------------------------------------
        // Choose Map Implementation
        // --------------------------------------
        // Map<String, Integer> map = new HashMap<>(); // Unordered
        Map<String, Integer> map = new TreeMap<>();    // Sorted by key (lexicographically)

        // --------------------------------------
        // Insertion
        // --------------------------------------
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        // --------------------------------------
        // Value Override: If key exists, new value replaces old value
        // --------------------------------------
        map.put("One", 23); // "One" → 1 is replaced by 23

        // --------------------------------------
        // putIfAbsent: Adds only if key not already present
        // --------------------------------------
        map.putIfAbsent("Two", 2); // Ignored since "Two" already exists

        System.out.println("Map contents: " + map);

        // --------------------------------------
        // Iteration Methods
        // --------------------------------------

        // Using entrySet() — gives both key and value
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

        // Using keySet() — iterate over keys
        System.out.println("\nIterating using keySet():");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // Using values() — iterate over values
        System.out.println("\nIterating using values():");
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }

        // --------------------------------------
        // Utility Operations
        // --------------------------------------
        System.out.println("\nContains key 'One'? " + map.containsKey("One"));
        System.out.println("Contains value 23? " + map.containsValue(23));

        // Remove by key
        System.out.println("Removed entry with key 'Three': " + map.remove("Three"));

        // Final state of map
        System.out.println("\nFinal Map: " + map);
    }
}
