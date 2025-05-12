package com.company;

public class running_sum {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        int[] sum= running(arr);

        for(int i=0 ;i<sum.length ;i++){
            System.out.print(sum[i]+" ");

        }

    }
    public static int[] running(int[] arr){
        int[] sum = new int[arr.length];

        for(int i=0 ;i<arr.length ;i++){
            sum[i] = arr[i];
        }
        for(int i=1 ;i<sum.length ;i++){
            sum[i]+=sum[i-1];
        }
        return sum;

    }

}
