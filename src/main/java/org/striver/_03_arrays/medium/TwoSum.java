package org.striver._03_arrays.medium;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        System.out.println(hasTwoSum(arr,target));
    }

    public static boolean hasTwoSum(int[] arr, int target){
//        for (int i : arr) {
//            for (int j : arr) {
//                if(i == j) continue;
//                if (i + j == target) {
//                    return true;
//                }
//             }
//        }
//        Map<Integer,Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            int complement = target - arr[i];
//
//            if (hashMap.containsKey(complement)) {
//                return true;
//            }
//
//            hashMap.put(arr[i], i);
//        }
        Arrays.sort(arr);
        int left = 0, right = arr.length-1;
        while(left < right){
            if(arr[left]+arr[right] == target){
                return true;
            }
            else if(arr[left]+arr[right] < target){
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }
}
