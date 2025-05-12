package com.company;

import java.util.PriorityQueue;

public class kth_largest {

    public static void main(String[] args) {
        int[] arr ={40,  30 , 20 , 10};
        int k=2;
        int kth =kthlargest(arr , k);
        System.out.println("kth largest element : "+ kth);
    }

    public static int kthlargest(int[] arr , int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();     //For kth largest , we need a min-heap

        for(int i=0;i<k ;i++){
            pq.add(arr[i]);
        }

        for(int i=k; i<arr.length ;i++) {
            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
       return pq.peek();
    }
}
