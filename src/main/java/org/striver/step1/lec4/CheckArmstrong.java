package org.striver.step1.lec4;

public class CheckArmstrong {
    public static void main(String[] args) {
        int n = 371, original = n, armStrong = 0;
        while(n!=0){
            armStrong += (int) Math.pow(n%10,3);
            n=n/10;
        }
        System.out.println(armStrong == original ? "Armstrong number" : "Not an Armstrong number");
    }
}
