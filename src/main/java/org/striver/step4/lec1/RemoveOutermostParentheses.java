package org.striver.step4.lec1;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        StringBuilder op = new StringBuilder();
        int i = 0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==')'){
                i--;
            }
            if(i>0){
                op.append(s.charAt(j));
            }
            if(s.charAt(j)=='('){
                i++;
            }
        }
        System.out.println(op);
    }
}
