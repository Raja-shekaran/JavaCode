package org.example.step1.lec1;

public class _7_WhileAndDoWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("While loop iteration: " + i);
            i++;
        }

        int j = 0;
        do{
            System.out.println("Do while loop iteration: " + j);
            j++;
        }while(j < 5);
    }
}
