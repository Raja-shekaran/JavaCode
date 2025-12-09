package practise;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 3, 4};
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
        while(i<arr1.length){
            if(list.isEmpty() || list.get(list.size() - 1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length){
            if(list.isEmpty() || list.get(list.size() - 1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        System.out.println(list.size());
        System.out.println(list);
    }
}
