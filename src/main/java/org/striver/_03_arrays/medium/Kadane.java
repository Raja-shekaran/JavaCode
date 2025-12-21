package org.striver._03_arrays.medium;

public class Kadane {
    public static void main(String[] args) {
        int[] nums = {-2,-3,4,-1,-2,1,5,-2};
        System.out.println(maxSubArray(nums));
    }
    //Kadane’s Algorithm
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0, start = 0, ansStart = 0, ansEnd = 0;
        for(int i=0;i<nums.length;i++){
            if(sum == 0) start = i;
            sum += nums[i];

            if(sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;;
            }

            if(sum<0){
                sum = 0;
            }
        }
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return max;
    }
}
