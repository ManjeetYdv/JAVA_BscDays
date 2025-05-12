package com.company;

import java.util.Vector;

public class intersection {

    public Vector<Integer> intersect(int[] arr1 ,int[] arr2){

        Vector<Integer> e = new Vector<Integer>();
        int i=0;
        int j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                e.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return e;

    }

}
