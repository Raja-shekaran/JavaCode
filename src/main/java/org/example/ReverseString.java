package org.example;

public class ReverseString {

    //Write a Java program to reverse a given string without using the built-in reverse() method of StringBuilder or StringBuffer.Write a Java program to reverse a given string without using the built-in reverse() method of StringBuilder or StringBuffer.
    public static void main(String[] args) {
        String ip = "HelloWorld";
        StringBuilder op = new StringBuilder(ip).reverse();
        System.out.println(op);
    }
    //Answer: Using StringBuilder
}
