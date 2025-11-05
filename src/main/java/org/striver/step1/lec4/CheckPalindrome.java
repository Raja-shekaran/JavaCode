package org.striver.step1.lec4;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 121, original = n, rev=0;
        while(n!=0)
        {
            rev = rev*10 + n%10;
            n=n/10;
        }
        System.out.println(rev == original ? "Palindrome" : "Not a palindrome");
    }
}
