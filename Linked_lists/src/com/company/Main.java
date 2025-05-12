package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LL list = new LL();

        list.InsertAtFirst(4);
        list.InsertAtFirst(3);
        list.InsertAtFirst(2);
        list.InsertAtFirst(1);
        list.InsertAtLast(4);
        list.InsertAtLast(5);
        list.InsertAtLast(5);
        list.InsertAtLast(1);
        list.removeDuplicates_unsorted();
        list.display();



        int arr[]={1 , 2, 3, 4};

        Vector<Integer> temp = new Vector<>();
        temp.add(0);
        temp.add(1);
        System.out.println(temp.get(0) +" "+ temp.get(1));
        Collections.swap(temp , 0 , 1);
        System.out.println(temp.get(0) +" "+ temp.get(1));

        String str = "abcd";
        String s ="bcfff";
        System.out.println(str.indexOf(s));

        System.out.println(s);
        s.replace('f' , 'z');


        List<List<Integer>> lst = new ArrayList<>();




    }




}
