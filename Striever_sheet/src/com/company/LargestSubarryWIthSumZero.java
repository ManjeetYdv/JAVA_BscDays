package com.company;

import java.util.HashMap;

public class LargestSubarryWIthSumZero {


    public static void main(String[] args) {

        int[] arr= {15,-2,2,-8,1,7,10,23};

        HashMap<Integer , Integer> map = new HashMap<>();

        int prefix_sum=0;
        int maxLen=0;
        int currLen=0;

        map.put(0 , -1);

        for(int i=0 ;i<arr.length ;i++){
            prefix_sum +=arr[i];
            if(!map.containsKey(prefix_sum)){
                map.put(prefix_sum , i);

            }
            else{
                currLen = i- map.get(prefix_sum);
                maxLen = Integer.max(maxLen , currLen);
            }
        }
        System.out.println(maxLen);

    }
}
