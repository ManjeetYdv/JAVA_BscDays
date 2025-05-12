package com.company;

public class rotate_array {

    public void left(int[] arr){
        int temp = arr[0];

        for(int i=1 ;i<arr.length ;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;




    }

    public void right(int[] arr){
        int temp = arr[arr.length-1];

        for(int i=arr.length-1 ;i>0 ;i--){
            arr[i]=arr[i-1];
        }

        arr[0]=temp;
    }
}
