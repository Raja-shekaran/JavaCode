package org.striver._04_strings.medium;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
    public static int romanToInt(String s) {
        Map<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);

        int result = hashMap.get(s.charAt(s.length()-1));
        for (int i = s.length() - 2; i >= 0; i--) {
            int current = hashMap.get(s.charAt(i));
            int next = hashMap.get(s.charAt(i + 1));

            if(current < next){
                result -= current;
            }else{
                result += current;
            }
        }
        return result;
    }
}
