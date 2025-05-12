package com.company;

import java.util.Vector;

public class pascal_triangle {



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

    public static Vector<Vector<Integer>> pascalTriangle(int n){
        Vector<Vector<Integer>> pascal = new Vector<>();
        Vector<Integer> row = new Vector<>();

        for(int i= 1 ;i<=n ;i++){
            row= pascal_IthRow(i);
            pascal.add(row);
        }
        return pascal;

    }
    public static void main(String[] args) {
      Vector<Vector<Integer>> pascal = pascalTriangle(5);

      for(Vector<Integer> pascalRow : pascal){
          for(int i= 0;i<pascalRow.size() ;i++){
              System.out.print(pascalRow.get(i)+" ");
          }
          System.out.println("");
      }
    }
}