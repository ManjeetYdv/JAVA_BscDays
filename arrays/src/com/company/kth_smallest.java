package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class kth_smallest {
    public static void main(String[] args) {

        int[] arr={40,  30 , 20 , 10};
        int k=2;
        int kth=kthsmallest(arr , k);
        System.out.println("kth smallest element : "+ kth);


    }
    public static int kthsmallest(int[] arr  ,int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());   //Max-heap

        for(int i=0 ;i<k ;i++){
            pq.add(arr[i]);

        }

        for(int i=k ;i<arr.length ;i++){
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }

        return pq.peek();
    }

}
