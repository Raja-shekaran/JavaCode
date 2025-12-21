package org.striver._03_arrays.easy;

public class RemoveDuplicates_Sorted {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,3,4,5,5,6};
        int noOfUnique = removeDuplicates(arr);
        System.out.println(noOfUnique);
        for (int i=0;i<noOfUnique;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDuplicates(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
