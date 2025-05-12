package com.company;

import java.util.Vector;

public class ith_row_of_pascal_triangle {

    public static Vector<Integer> pascal_IthRow(int n){

        Vector<Integer> row = new Vector<>();
        int res=1;
        row.add(1);
        n= n-1;

        for(int i=0 ;i<n ;i++){
            res *=(n-i);
            res/= (i+1);
            row.add(res);
        }

        return row;
    }

    public static void main(String[] args) {
        Vector<Integer> pascal = new Vector<>();
        pascal = pascal_IthRow(3);

        for(int i=0 ;i<pascal.size() ;i++){
            System.out.print(pascal.get(i)+" ");
        }

    }
}