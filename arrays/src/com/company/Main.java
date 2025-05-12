package com.company;

import java.util.PriorityQueue;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        int[] arr ={20 , 10, 30 ,40};
        int[] arr2 ={100 , 3 , 10 , 25};

        Max_array_from_2arrays obj = new Max_array_from_2arrays();
        obj.maximize(arr , arr2);

        for(int i=0 ;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }

        }
    }

