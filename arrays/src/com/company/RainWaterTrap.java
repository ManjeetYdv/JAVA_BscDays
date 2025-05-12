package com.company;

import java.util.Vector;

class A {

    public void see(){
        System.out.println(walk());
    }
    public int walk(){
        return -1;
    }
}
public class RainWaterTrap{

    static int maxRainWater(int[] arr , int n){

        int []left = new int[n];
        int []right= new int[n];

        left[0]=arr[0];
        right[n-1] =arr[n-1];

        for(int i=1 ;i<n ;i++){
            left[i] = Math.max(left[i-1] , arr[i]);
        }

        for(int i=arr.length-2 ;i>=0 ;i--){
            right[i] = Math.max(right[i+1] ,arr[i]);
        }

        int water=0;

        for(int i=1 ;i<arr.length-1 ;i++){

            int var = Math.min(left[i-1] , right[i+1]);
            if(var>arr[i]){
                water += (var-arr[i]);
            }
        }

        return water;
    }


    public static void main(String[] args) {

        int[] arr ={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;

        System.out.println(maxRainWater(arr, n));
        Vector<Integer> res = new Vector<>();


    }
}
