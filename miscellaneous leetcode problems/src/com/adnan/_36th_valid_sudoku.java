package com.adnan;

/*

36. Valid Sudoku
Medium

6308

792

Add to List

Share
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.


Example 1:


Input: board =
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
Example 2:

Input: board =
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.


Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit 1-9 or '.'.
Accepted
859,493
Submissions
1,523,467


* */




public class _36th_valid_sudoku {
    public static void main(String[] args) {
        char[][] board = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(board));
    }
    // slow solution
//     public boolean isValidSudoku(char[][] board) {

//         HashSet<String> set = new HashSet();
//         for (int i=0; i<9; i++){
//             for(int j=0; j<9; j++){
//                 char cur = board[i][j];
//                 if (cur!='.'){
//                     if(!set.add(cur + "in row" + i) ||
//                        !set.add(cur + "in col" + j) ||
//                        !set.add(cur + "in box" + i/3 + "," +j/3)){
//                           return false;
//                     }
//                 }
//             }
//         }
//         return true;

    //     }
    //
    //
    // fastest solution
    public static boolean isValidSudoku(char[][] board) {
        // Base case...
        if (board == null || board.length != 9 || board[0].length != 9)
            return false;

        //For each column check that their is repeatation of any digit present in filled cells...
        for (int i = 0; i < 9; i++) {
            boolean[] set = new boolean[9];
            for (int j = 0; j < 9; j++) {
                // For filled cells only...
                if (board[i][j] != '.') {
                    // That number-1, is its index in every checking array...
                    if (set[(int) (board[i][j] - '1')]) {
                        return false;
                    }
                    set[(int) (board[i][j] - '1')] = true;
                }
            }
        }

        // For each row check that their is repeatation of any digit present in filled cells...
        for (int j = 0; j < 9; j++) {
            boolean[] set = new boolean[9];
            for (int i = 0; i < 9; i++) {
                // For filled cells only
                if (board[i][j] != '.') {
                    // That number-1, is its index in every checking array...
                    if (set[(int) (board[i][j] - '1')]) {
                        return false;
                    }
                    set[(int) (board[i][j] - '1')] = true;
                }
            }
        }

        // Check that every 3*3 grid must contain different values means no repeatation of any digit present in filled cells...
        for (int grid = 0; grid < 9; grid++) {
            boolean[] set = new boolean[9];
            // Traverse each grid through the loops...
            for (int i = grid / 3 * 3; i < grid / 3 * 3 + 3; i++) {
                for (int j = grid % 3 * 3; j < grid % 3 * 3 + 3; j++) {
                    // For filled cells only...
                    if (board[i][j] != '.') {
                        // That number-1, is its index in every checking array
                        if (set[(int) (board[i][j] - '1')]) {
                            return false;
                        }
                        set[(int) (board[i][j] - '1')] = true;
                    }
                }
            }
        }
        return true;
    }

}
