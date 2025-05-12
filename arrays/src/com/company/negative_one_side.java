package com.company;

public class negative_one_side {

    public static void main(String[] args) {

        int[] arr = {4 ,5 ,-1 , -2};
        oneside(arr);

        for(int i= 0;i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }


    }
    public static void oneside(int[] arr){

        int j=0;
        int temp;

        for(int i=0 ;i<arr.length ;i++){

            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
                j++;
            }
        }

    }

}
