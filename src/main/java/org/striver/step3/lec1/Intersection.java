package org.striver.step3.lec1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1  = {1,2,8,8,10};
        int[] arr2  = {1,2,3,3,8};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }

    public static int[] intersection(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();
        //Brute Force
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<arr2.length;j++){
//                if(arr1[i]==arr2[j] && (list.isEmpty() || list.get(list.size()-1) != arr1[i])){
//                    list.add(arr1[i]);
//                }
//            }
//        }
        //Optimal
        int i = 0;
        int j = 0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i] < arr2[j]) i++;
            else if(arr2[j] < arr1[i]) j++;
            else{
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
