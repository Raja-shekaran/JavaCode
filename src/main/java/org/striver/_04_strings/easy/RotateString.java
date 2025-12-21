package org.striver._04_strings.easy;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
    public static boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            if((s.substring(i)+s.substring(0,i)).equals(goal)){
                return true;
            }
        }
        return false;
        //return (s + s).contains(goal); -> optimal
    }
}
