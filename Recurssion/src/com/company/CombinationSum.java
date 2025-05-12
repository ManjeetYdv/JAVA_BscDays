package com.company;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

   static List<List<Integer>> res;

   static void func(int[]arr ,int index , int target  , List<Integer> list){

       if(index==arr.length){
           if(target==0){
               res.add(new ArrayList<>(list));
           }
           return;
       }

       if(arr[index]<=target){
           list.add(arr[index]);
           func(arr ,index , target-arr[index]  , list);
           list.remove(list.size()-1);
       }
       func(arr , index+1 ,target , list);

   }

    static List<List<Integer>> combination(int[]arr , int target){
        res = new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        func(arr , 0 , target , list);
        return res;
    }
    public static void main(String[] args) {

        int[]arr ={2,3,6,7};
        int target =7;

        List<List<Integer>> list = new ArrayList<>();
        list= combination(arr , target);

        for(List<Integer> lust : list){
            for(int i : lust){
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}
