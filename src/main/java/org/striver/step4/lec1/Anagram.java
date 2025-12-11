package org.striver.step4.lec1;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] temp = new int[256];
        for(char c : s.toCharArray()) temp[c]++;
        for(char c : t.toCharArray()) temp[c]--;

        for (int j : temp) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
