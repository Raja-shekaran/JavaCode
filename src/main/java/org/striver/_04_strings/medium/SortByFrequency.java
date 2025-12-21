package org.striver._04_strings.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
    public static String frequencySort(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for(char c : s.toCharArray()) hashMap.put(c,hashMap.getOrDefault(c,0)+1);

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : list){
            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }
}
