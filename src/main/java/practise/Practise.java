package practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practise {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 4, 1, 5, 9, 3, 3};
        Map<Integer, Integer> hashMap = new LinkedHashMap<>();

        for (int num : arr) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        boolean found = false;

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(-1);
        }

    }
}
