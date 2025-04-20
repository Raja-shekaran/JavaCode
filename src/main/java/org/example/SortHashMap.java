package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMap {
    public static void main(String[] args) {
        // Sample HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 3);
        map.put("apple", 1);
        map.put("cherry", 2);

        System.out.println("Original Map: " + map);

        // ======= Traditional =======
        // Sort by Key
        Map<String, Integer> sortedByKey = new TreeMap<>(map);
        System.out.println("\nSorted by Key (Traditional): " + sortedByKey);

        // Sort by Value
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted by Value (Traditional): " + sortedByValue);

        // ======= Java 8 =======
        // Sort by Key (Java 8)
        Map<String, Integer> sortedByKeyJava8 = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println("\nSorted by Key (Java 8): " + sortedByKeyJava8);

        // Sort by Value (Java 8)
        Map<String, Integer> sortedByValueJava8 = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println("Sorted by Value (Java 8): " + sortedByValueJava8);
    }
}
