package com.company;

import java.util.HashMap;
import java.util.Vector;

public class DuplicateNumber {

    public static int firstRepeat(int [] arr){
        HashMap<Integer , Integer> exists = new HashMap<>();

        for(int i=0 ;i<arr.length ;i++){
            exists.put(arr[i] , 0);
        }
        int repeat = 0;
        for(int i=0 ;i<arr.length ;i++){
            if(exists.get(arr[i])==0){
                exists.put(arr[i] , 1);
            }
            else {
                repeat = arr[i];
                break;
            }
        }
        return repeat;
    }
    public static void main(String[] args) {
        int[] arr={3 ,4 ,3 , 4};
        System.out.println(firstRepeat(arr));
    }
}
