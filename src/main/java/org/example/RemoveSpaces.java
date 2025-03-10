package org.example;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Hello World";
        //String str = " Java Programming ";
        StringBuilder sb = new StringBuilder();
        for(char a : str.toCharArray()){
            if(!Character.isWhitespace(a)){
                sb.append(a);
            }
        }
        //System.out.println(str.replaceAll("\\s", ""));
        System.out.println(sb);
    }
}
