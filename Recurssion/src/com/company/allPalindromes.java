package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class allPalindromes {

static boolean isPal(String s , int i , int j){

    while(i<=j){

        if(s.charAt(i)!=s.charAt(j)) return false;
        else{
            i++;
            j--;
        }
    }
    return true;

}



    public static void main(String[] args) {

        String str="aabb";
       List<String> res = new ArrayList<>();
       res.add("");

       for(int i=0 ;i<str.length() ;i++){
            for(int j=i ;j<str.length() ;j++){

                if(isPal(str, i , j)){
                    res.add(str.substring(i , j+1));
                }
            }
        }
        System.out.println("ALl Palindromes : ");
        for(String s  : res){
            System.out.println(s+" ");
        }


    }
}
