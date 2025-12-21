package org.striver._01_basics._04_maths;

public class LCM_HCF {
    public static void main(String[] args) {
        int x = 36;
        int y = 60;
        System.out.println("LCM: " +lcm(x,y));
    }

    public static int hcf(int x, int y){
        while(y!=0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }

    public static int lcm(int x, int y)
    {
        int hcf = hcf(x,y);
        System.out.println("HCF: " +hcf);
        return (x*y)/hcf;
    }
}
