package practise;

public class Test {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(findLongestSubArraySum(nums,k));

    }
    public static int findLongestSubArraySum(int[] nums, int k){
        int length = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum==k){
                    length=Math.max(length,j-i+1);
                }
            }
        }
       return length;
    }
}
