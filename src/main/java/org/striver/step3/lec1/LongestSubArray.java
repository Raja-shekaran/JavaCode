package org.striver.step3.lec1;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 3;
//        int ans = 0;
//        for(int i=0;i<arr.length;i++){
//            int sum = 0;
//            for(int j=i;j<arr.length;j++){
//                sum += arr[j];
//                if(sum == k){
//                    int subLen = j - i + 1;
//                    ans = Math.max(ans, subLen);
//                }
//            }
//        }
//        System.out.println(ans);
//        Map<Integer,Integer> hashMap = new HashMap<>();
//        int res = 0;
//        int prefSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            prefSum += arr[i];
//
//            if (prefSum == k)
//                res = i + 1;
//
//            else if (hashMap.containsKey(prefSum - k))
//                res = Math.max(res, i - hashMap.get(prefSum - k));
//
//            if (!hashMap.containsKey(prefSum))
//                hashMap.put(prefSum, i);
//        }
//        System.out.println(res);

//        int left = 0, right = 0;
//        int sum = arr[0];
//        int maxLen = 0;
//        int n = arr.length;
//        while(right < n){
//           while(left <= right && sum > k){
//               sum -= arr[left];
//               left++;
//           }
//           if(sum == k){
//               maxLen = Math.max(maxLen,right-left+1);
//           }
//           right++;
//           if(right < n) sum += arr[right];
//        }
//        System.out.println(maxLen);
    }
}
