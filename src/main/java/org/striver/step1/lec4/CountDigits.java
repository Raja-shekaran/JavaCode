package org.striver.step1.lec4;

public class CountDigits {
    public static void main(String[] args) {
        int k = 123456;
        int count = 0;
        while(k>0)
        {
            k = k/10;
            count++;
        }
        System.out.println(count);
    }
}
