package org.striver.step4.lec1;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi(" -042"));
    }
    public static int myAtoi(String s) {
        s = s.trim();
        int sign = 1, i = 0;
        long res = 0;

        if (s.isEmpty()) return 0;

        // Check for sign
        if (s.charAt(0) == '-') { sign = -1; i++; }
        else if (s.charAt(0) == '+') { i++; }

        // Process numerical characters
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break; // Stop at non-numeric character

            res = res * 10 + (ch - '0'); // Convert char to number
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; // Handle overflow
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        return (int) (sign * res);
    }

}
