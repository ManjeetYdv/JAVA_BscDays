package com.company;

public class RemovePalindromicSubsequences {

    public static int solution(String str){
        int i=0;
        int j=str.length()-1;

        while(i<=j){
            if(str.charAt(i++)!=str.charAt(j--)){
                return 2;
            }

        }
        return 1;

    }
    public static void main(String[] args) {
        String str ="abbbabbababa";
        System.out.println(solution(str));
    }
}
