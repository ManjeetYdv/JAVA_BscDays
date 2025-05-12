package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class priority_queue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq_min = new PriorityQueue<>();   //Min-Heap by default
        pq_min.add(10);
        pq_min.add(5);
        pq_min.add(25);

        System.out.print("Min-heap : " );
        while(!pq_min.isEmpty()){
            System.out.print(pq_min.peek()+" ");       //output ->5 , 10 , 25
            pq_min.poll();
        }

        System.out.println("");
        PriorityQueue<Integer> pq_max = new PriorityQueue<>(Collections.reverseOrder());  //For max-heap
        pq_max.add(10);
        pq_max.add(5);
        pq_max.add(25);

        System.out.print("Max-heap : ");
        while(!pq_max.isEmpty()){
            System.out.print(pq_max.peek()+" ");       //output ->25 , 10 , 5
            pq_max.poll();
        }
    }


}
