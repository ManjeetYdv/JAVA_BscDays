package com.company;

public class Sudoku {


    static boolean solve(char[][] board){

        for(int i=0 ;i<board.length ;i++){
            for(int j=0 ;j<board[0].length ;j++){

                if(board[i][j]=='.'){
                    for(char c = '1' ;c<='9' ;c++){

                        if(valid(board , c,   i ,  j)){
                            board[i][j] = c;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;

                }
            }
        }

        return true;

    }

    static boolean valid(char[][] board  , char c , int row , int col){

        for(int i=0 ;i<9 ;i++) {
            if (board[i][col] == c) return false;
            if (board[row][i] == c) return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
        }
        return true;

    }
    public static void main(String[] args) {
        char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };

        solve(board);

        for(int i=0 ;i<board.length ;i++){
            for(int j=0 ;j<board[0].length ;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
}
