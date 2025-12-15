package org.striver.step3.lec1;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,3};
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int num : nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if(entry.getValue() > nums.length/2){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
