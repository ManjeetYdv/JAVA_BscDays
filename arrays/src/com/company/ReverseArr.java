package com.company;

import java.util.Arrays;

public class ReverseArr {

    public void reverseArr(int[] arr){

        int size = arr.length;
        for(int i=0 ;i<size/2 ;i++){

            int temp= arr[size-1-i];
            arr[size-1-i] = arr[i];
            arr[i] =temp;

        }

    }
}
