package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDuplicate {
    public static void main(String[] args) {
        String input = "I am a java developer and I am proud of it";
        String[] words = input.split("\\s+");

        System.out.println("=== Using Traditional Approach ===");
        findDuplicatesTraditional(words);

        System.out.println("\n=== Using Java 8 Streams ===");
        findDuplicatesWithStreams(words);
    }

    private static void findDuplicatesTraditional(String[] words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            int count = wordCountMap.getOrDefault(word, 0) + 1;
            wordCountMap.put(word, count);

            if (count == 2) { // Print only when it's first found as a duplicate
                System.out.println(word + " => " + count);
            }
        }

        System.out.println("All Word Counts: " + wordCountMap);
    }

    private static void findDuplicatesWithStreams(String[] words) {
        Map<String, Integer> wordCountMap = Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)
                ));

        wordCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));

        System.out.println("All Word Counts: " + wordCountMap);
    }
}

