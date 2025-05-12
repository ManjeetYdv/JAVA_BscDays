package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class climbingStairs {



    static int maxWays( int curr){

        if(curr==0){

            return 1;
        }

        int i=0;
        if(curr>=2){
             i =maxWays( curr-2);
        }
           int j=  maxWays(curr-1);

        return i+j;
    }
    public static void main(String[] args) {

        System.out.println(maxWays(4));


        List<Integer> list = new ArrayList<>();

    }
}
