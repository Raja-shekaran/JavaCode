package practise;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Practise {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 5, 3, 2};
        System.out.println(firstRepeating(arr));
    }

    public static int firstRepeating(int[] arr){
        int ans = -1;
        Set<Integer> set = new HashSet<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(set.contains(arr[i])){
                ans = arr[i];
            }
            else{
                set.add(arr[i]);
            }
        }
        return ans;
    }
}
