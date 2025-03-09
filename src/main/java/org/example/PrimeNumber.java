package org.example;

public class PrimeNumber {
    //Write a Java program to check if the given number is a prime number.
    public static void main(String[] args) {
        int num = 2;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        if (n == 2 || n == 3) return true; // 2 and 3 are prime numbers
        if (n % 2 == 0 || n % 3 == 0) return false; // Eliminate even numbers and multiples of 3

        // Check only odd numbers from 5 to √n (skipping even numbers)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
