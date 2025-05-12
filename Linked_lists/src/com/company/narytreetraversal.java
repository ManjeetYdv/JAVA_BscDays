package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class narytreetraversal {

    public static List<List<Integer>> levelOrder(Node root) {

        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        queue.add(root);

       while(!queue.isEmpty()){
            int size = queue.size();

            List<Integer> list = new ArrayList<>();
            for(int i=0 ;i<size ;i++){
                //preparing the answer
                list.add(queue.peek().val);
                //traversing the kids
                List<Node> children = queue.poll().children;

                if(children.size()!=0){
                    for(int j=0 ;j<children.size() ;j++){
                        queue.add(children.get(j));
                    }
                }

            }
            res.add(list);

       }

       return res;

    }

    public static void main(String[] args) {

    }
}
