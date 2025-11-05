package org.striver.step1.lec4;

public class CheckPrime {
    public static void main(String[] args) {
        //Number that has exactly two factors 1 and itself
        int count = 0, n=2;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }
        System.out.println(count==2 ? "Prime" : "Not Prime");
    }
}
