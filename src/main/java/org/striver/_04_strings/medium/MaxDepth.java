package org.striver._04_strings.medium;

public class MaxDepth {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
    public static int maxDepth(String s) {
        int maxDepth = 0, count = 0;
        for(char c : s.toCharArray()){
            if(c == '(') count++;
            else if(c == ')') count--;
            maxDepth = Math.max(maxDepth,count);
        }
        return maxDepth;
    }
}
