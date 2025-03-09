package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VowelDetector {
    //Write a Java program to check if a vowel (a, e, i, o, u) is present in a given string. The program should be case-insensitive (i.e., it should detect vowels in both uppercase and lowercase).
    public static void main(String[] args) {
        String str = "Hello";
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        Map<Character , Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (vowels.contains(ch)) {
                map.put(ch, map.getOrDefault(ch,0) + 1);
            }
        }
        if (map.isEmpty()) {
            System.out.println("No vowels found.");
        } else {
            System.out.println("Vowel(s) found: " + map);
        }
    }
}
