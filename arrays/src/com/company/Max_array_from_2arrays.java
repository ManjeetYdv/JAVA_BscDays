package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class Max_array_from_2arrays {
    public void maximize(int[] arr1 , int[] arr2){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  //MAx-heap

        for(int i=0 ;i<arr2.length ;i++){
            pq.add(arr2[i]);
        }

        for(int i=0 ;i<arr1.length ;i++){
            if(arr1[i]< pq.peek()){
                int temp = arr1[i];
                arr1[i] = pq.peek();
                pq.poll();
                pq.add(temp);
            }

        }
    }
}
