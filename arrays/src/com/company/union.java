package com.company;

import java.util.Vector;

public class union {

    public Vector<Integer> union(int[] arr1 , int[] arr2) {
        Vector<Integer> vector = new Vector<>();

        int i =0;
        int j =0;

        while(i<arr1.length && j<arr2.length){

            if(arr1[i]==arr2[j]){
                vector.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                vector.add(arr1[i]);
                i++;
            }
            else{
                vector.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            vector.add(arr1[i++]);

        }
        while(j<arr2.length){
            vector.add(arr2[j++]);
        }

        return vector;
    }
}
