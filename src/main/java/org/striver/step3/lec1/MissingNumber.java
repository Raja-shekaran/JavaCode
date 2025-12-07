package org.striver.step3.lec1;

public class MissingNumber {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {1,2,4,5};
//        int sum = 0;
//        for(int num: arr){
//            sum+=num;
//        }
//        System.out.println((N*(N+1))/2-sum);
        int xor1 = 0, xor2 = 0;
        for(int i=1;i<=N;i++){
            xor1 ^= i;
        }
        for(int num: arr){
            xor2 ^= num;
        }
        System.out.println(xor1^xor2);
    }
}
