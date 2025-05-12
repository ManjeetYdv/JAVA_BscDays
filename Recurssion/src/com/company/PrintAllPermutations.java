package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class PrintAllPermutations {

  static  List<List<Integer>> res;

   static void allPermutations(int[]arr , int index , List<Integer>list ){

       if(index==arr.length){
           res.add(new ArrayList<>(list));
           return;
       }

       for(int i=index ;i<arr.length ;i++){
           Collections.swap(list , index , i);
           allPermutations(arr , index+1 , list);
           Collections.swap(list , index , i);
       }

   }

      public static void main(String[] args) {

          res = new ArrayList<>();
          List<Integer> list = new ArrayList<>();

          int[] arr = {1, 2, 3};
          for (int i : arr) {
              list.add(i);
          }

          allPermutations(arr , 0 , list);


          for(List<Integer> l :  res){
              for(int i  : l){
                  System.out.print(i+" ");
              }
              System.out.println();
          }
      }
}
