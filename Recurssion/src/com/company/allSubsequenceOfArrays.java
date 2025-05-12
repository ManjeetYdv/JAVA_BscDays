package com.company;

import java.util.ArrayList;
import java.util.List;

public class allSubsequenceOfArrays {

   static List<List<Integer>> seq ;

   static void allSeq(int[]arr , int index , List<Integer>list ){

       if(index==arr.length){
           seq.add(new ArrayList<>(list));
           return;
       }

       list.add(arr[index]);
       allSeq(arr , index+1 , list);
       list.remove(list.size()-1);

       allSeq(arr , index+1 , list);


   }
    public static void main(String[] args) {

        int[]arr ={1 ,2,3};
        seq = new ArrayList<>();

        allSeq(arr ,0 , new ArrayList<>());

        for(List<Integer> list :seq){
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
