package org.striver.step4.lec1;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] arr = s.split("\\s+");
        StringBuilder op = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            op.append(arr[i]).append(" ");
        }
        System.out.println(op.toString().trim());
    }
}
