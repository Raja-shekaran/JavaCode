package org.example;

public class Palindrome {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(isPalindrome(str));

        str = "madam";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

}
