package org.striver.step3.lec1;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum == k){
                    int subLen = j - i + 1;
                    ans = Math.max(ans, subLen);
                }
            }
        }
        System.out.println(ans);
    }
}
