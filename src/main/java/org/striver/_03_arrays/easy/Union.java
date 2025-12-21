package org.striver._03_arrays.easy;

import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[] arr1  = {1,2,8,8,10};
        int[] arr2  = {1,2,3,3,8};
        System.out.println(Arrays.toString(union(arr1, arr2)));
    }

    public static int[] union(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                if(list.isEmpty() || list.get(list.size() - 1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[j] < arr1[i]){
                if(list.isEmpty() || list.get(list.size() - 1) != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
            else{
                if(list.isEmpty() || list.get(list.size() - 1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Append remaining elements from arr1
        while (i < arr1.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i])
                list.add(arr1[i]);
            i++;
        }

        // Append remaining elements from arr2
        while (j < arr2.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j])
                list.add(arr2[j]);
            j++;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
