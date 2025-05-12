package com.company;

import java.util.HashMap;

public class CountSubArrWithSum_k
{

    public static void main(String[] args) {
        int[] arr= {1 ,2 ,3};

        int ans=0;
        int k=3;
        HashMap<Integer  , Integer> map = new HashMap<>();  //key-presum  , value-fequency
        map.put(0 , 1);
        int sum=0;

        for(int i=0 ;i<arr.length; i++){
            sum+=arr[i];

            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum , map.getOrDefault(sum , 0)+1);


        }
        System.out.println(ans);

    }
}
