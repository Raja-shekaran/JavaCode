package org.striver._01_basics._04_maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;
        while(num!=0)
        {
            int temp = num%10;
            reversed = reversed*10 + temp;
            num=num/10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
