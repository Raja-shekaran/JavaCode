package practise;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 3, 0, 4};
        int key = 1, ans = -1;
        for (int i=0;i<nums.length;i++){
            if(key==nums[i]){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
