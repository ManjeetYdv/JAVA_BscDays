package com.company;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class two_d_matrix {
    public static void main(String[] args) {

        int k=1;
        int[][] array = new int[2][3];
        for (int[] arr1 : array) {
            Arrays.fill(arr1, k++);
        }


        System.out.println(array.length +" " +array[0].length);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
       int[][] trans = transpose(array);
        int x = trans.length;
        int y=  trans[0].length;

        for(int i=0 ;i<x ;i++){
            for(int j=0 ;j<y ;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] arr){
        int x = arr[0].length;
        int y= arr.length;

        int[][] trans = new int[x][y];

        for(int i=0;i<y ;i++){
           for(int j=0 ; j<x ;j++) {
               trans[j][i]= arr[i][j];

            }
        }
        return trans;

    }


}
