package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InterviewPrep2 {
    public static void main(String[] args) {
        String s = "malik";
        StringBuilder sb = new StringBuilder(s);//Not Thread Safe and Mutable
        System.out.println(sb.reverse());

        //Reverse Num - Using recursion
        System.out.println(reverseNum(12345));

        //Palindrome
        int num = 111;
        System.out.println(num == reverseNum(num));

        //Fibonacci
        System.out.println(printFibonacci(7));
        //Fibonacci Recursion
        for(int i=0;i<7;i++){
            System.out.print(nthFibonacci(i)+" ");
        }
        System.out.println();

        //Frequency of Character
        String s1 = "mom";
        Map<Character,Integer> hashMap = new HashMap<>();
        for(char c : s1.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        System.out.println(hashMap);

        //Missing Number in an Array
        int[] arr = {1,2,4,5};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] != arr[i] + 1) {
                System.out.println(arr[i] + 1);
                break;
            }
        }

        //Sort
        int[] arr1 = {5, 1, 4, 2, 8};
        //selectionSort(arr1);
        bubbleSort(arr1);
        printArray(arr1);

    }

    //Recursion
    public static int reverseNum(int num){
        if(num < 10) return num;
        int temp = num%10;
        int count = (int) Math.log10(num);
        return (int) Math.pow(10,count) * temp + reverseNum(num/10);
    }

    //Fibonacci
    public static int printFibonacci(int n){
        int one = 0;
        int two = 1;
        int three = 0;
        System.out.println(one);
        System.out.println(two);
        for(int i=0;i<n-2;i++){
            three = one + two;
            one = two;
            two = three;
            System.out.println(three);
        }
        return three;
    }

    //Fibonacci - Recursion
    public static int nthFibonacci(int n){
        if(n<=1) return n;
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }

    //Selection Sort
    public static void selectionSort(int[] arr){
        int n = arr.length;
        int minIndex = -1;
        for(int i=0;i<n;i++){
            minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int t = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = t;
        }
    }

    //Bubble Sort
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for (int i=0 ; i < n-1;i++)
        {
            swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    //Print Array
    public static void printArray(int[] arr){
        for(int element : arr){
            System.out.println(element);
        }
    }

}
