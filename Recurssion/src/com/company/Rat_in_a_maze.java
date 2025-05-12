package com.company;


import java.util.ArrayList;
import java.util.HashMap;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
public class Rat_in_a_maze {

    public static void solve(int[][]arr , int [][] vis , ArrayList<String>res  , String move , int i , int j  ,int n){

        if(i==n-1 && j==n-1){
            res.add(move);
            return;
        }

        //Down
        if(i+1<n && vis[i+1][j]==0 && arr[i+1][j]==1){
            vis[i+1][j]=1;
            solve(arr , vis, res , move+'D' ,i+1 , j , n);
            vis[i+1][j]=0;
        }
        //left
        if(j-1>=0 && vis[i][j-1]==0 && arr[i][j-1]==1){
            vis[i][j-1]=1;
            solve(arr , vis , res ,move+'L' , i , j-1 , n);
            vis[i][j-1]=1;
        }

        //right
        if(j+1<n && vis[i][j+1]==0 && arr[i][j+1]==1){
            vis[i][j+1]=1;
            solve(arr ,vis , res , move+'R' , i , j+1  , n);
            vis[i][j+1]=0;
        }

        //Upper
        if(i-1>=0 && vis[i-1][j]==0 && arr[i-1][j]==1){
            vis[i-1][j]=1;
            solve(arr ,vis , res,  move+'U' ,i-1 , j ,n);
            vis[i-1][j]=0;
        }


    }
    public static ArrayList<String> findPath(int[][] m, int n) {

        ArrayList<String> res = new ArrayList<>();

        if(m[0][0]==0 || m[n-1][n-1]==0) return res;
        int[][]vis= new int[n][n];
        solve(m , vis   , res , "" , 0 ,0 ,n);
        return res;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0 ;i<preorder.length ;i++){
            map.put(preorder[i],i );
        }

        TreeNode root = build(preorder , 0 , preorder.length-1  , inorder , 0 , inorder.length-1 , map);
        return root;

    }

    public TreeNode build(int[]preorder , int preStart , int preEnd   , int[] inorder , int inStart  , int inEnd , HashMap<Integer , Integer> map){

        if(preStart>preEnd || inStart> inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int inRoot = map.get(root.val);
        int numsLeft = inRoot-inStart;

        root.left = build(preorder , preStart+1 , preStart+numsLeft , inorder , inStart , inRoot-1 ,map);
        root.right =build(preorder , preStart+numsLeft+1 ,  preEnd  , inorder , inRoot+1 ,preEnd , map);

        return root;




    }
    public static void main(String[] args) {
        int n = 4;

        int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

        ArrayList<String>res = findPath(a , n);

        for(String r : res){
            System.out.println(r);
        }


    }
}
