package practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practise {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3, 2, 2, 3, 3, 4};
        Map<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int num : arr) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
                break;
            }
        }
        //Boyer–Moore
//        int candidate = 0;
//        int count = 0;
//
//        for(int num: arr){
//            if(count == 0)
//            {
//                candidate = num;
//            }
//            if(num == candidate){
//                count++;
//            }else {
//                count--;
//            }
//        }
//        System.out.println(candidate);
    }
}
