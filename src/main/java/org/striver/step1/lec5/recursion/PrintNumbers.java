package org.striver.step1.lec5.recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        printName(0,5);
        System.out.println();
        print(1, 10);
        System.out.println();
        printRev(10, 1);
    }

    public static void printName(int start, int end){
        if (start == end) return; //Base Case
        System.out.print("Raja" + " ");
        printName(start + 1, end);  // Recursive call
    }

    public static void print(int start, int end){
        if (start > end) return; //Base Case
        System.out.print(start + " ");
        print(start + 1, end);  // Recursive call
    }

    public static void printRev(int start, int end){
        if (start < end) return; //Base Case
        System.out.print(start + " ");
        printRev(start - 1, end);  // Recursive call
    }
}
