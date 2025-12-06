package practise;

import java.util.*;

public class RapidFire {
    public static void main(String[] args) {
//        int num = -12345;
//        System.out.println(reverse(num));

        //Max appearing character
        String input = "banana";
        int[] freq = new int[256];
        for(char c : input.toCharArray()) freq[c]++;

        int max = 0;
        char ans = 0;
        for(char c : input.toCharArray()){
            if(freq[c] > max){
                max = freq[c];
                ans = c;
            }
        }
        System.out.println(ans);

        //Move all zeros to end
        int[] arr = {0,1,0,3,12};
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<arr.length;i++) arr[i] = 0;
        System.out.println(Arrays.toString(arr));

        //First non-repeating character
        String input2= "aabbcde";
        Map<Character,Integer> hashMap = new LinkedHashMap<>();
        for(char c : input2.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }

        //Anagram
        System.out.println(isAnagram("silent","listen"));
        System.out.println(isAnagram("hello","world"));

        //Isomorphic
        System.out.println(isIsomorphic("silent","listen"));

        //Palindrome
        String input3 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input3.toLowerCase().replaceAll("[^a-zA-Z]","")));

        //Remove duplicates
        int[] arr3 = {1,1,2,2,3,3,4,4};
        System.out.println(removeDuplicates(arr3));
        System.out.println(Arrays.toString(arr3));
    }

    public static int removeDuplicates(int[] nums){
        if (nums.length == 0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[j-1]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return rev.equals(s);
    }

    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;
        Map<Character,Character> sHash = new HashMap<>();
        Map<Character,Character> tHash = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(sHash.containsKey(s.charAt(i))){
                if(sHash.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
                else{
                    sHash.put(s.charAt(i),t.charAt(i));
                }
            }
            if(tHash.containsKey(t.charAt(i))){
                if(sHash.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
                else{
                    sHash.put(t.charAt(i),s.charAt(i));
                }
            }

        }
        return true;
    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] frequencyArray = new int[256];
        for(char c : s1.toCharArray()) frequencyArray[c]++;
        for(char c : s2.toCharArray()) frequencyArray[c]--;
        for(int i : frequencyArray){
            if(i!=0) return false;
        }
        return true;
    }

    public static int reverse(int n){
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
}
