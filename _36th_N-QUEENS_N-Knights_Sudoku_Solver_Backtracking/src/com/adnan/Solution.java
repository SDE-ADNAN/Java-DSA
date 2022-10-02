package com.adnan;

public class Solution {

    public boolean isSafe (char[][] board, int row, int col, int number) {

        // for row and column condition/checking
        for (int i = 0; i<board.length; i++) {

            if (board[i][col] == (char)(number + '0')) { // if number exist in the row
                return false;
            }

            if (board[row][i] == (char)(number + '0')) { // if number exist in the column
                return false;
            }
        }

        // for grid condition/checking
        int sr = (row/3)*3; // starting row of the grid
        int sc = (col/3)*3; // starting column of the grid

        for (int i = sr; i < (sr+3); i++) { // row iterations

            for (int j = sc; j < (sc+3); j++) { // column iterations

                if (board[i][j] == (char)(number +'0')) { // if number exists in the grid
                    return false;
                }
            }
        }

        return true; // if number is not present in any of the above conditions
    }

    // recursion function to check whether number is eligible or not to be placed
    public boolean helper (char[][] board, int row, int col) {

        // base condition
        if (row == board.length) { // we traversed full board and it is filled
            return true;
        }

        int nrow=0;
        int ncol=0; // Defining next row and col while using recursion

        if (col != board.length-1) { // We are not in last cell of a row
            nrow = row;
            ncol = col + 1; // traversing through row by increasing col number
        }
        else {
            nrow = row + 1; // going on to new row
            ncol = 0;
        }

        if (board[row][col] != '.') { // if the cell is not empty

            if (helper (board, nrow, ncol)) { // if this is true that means every cell is filled with number, hence return true (solution received)
                return true;
            }
        }
        else {

            for (int i = 1; i<=9; i++) {

                if (isSafe (board, row, col, i)) { // checks whether it is safe to place number i in that cell
                    board[row][col] = (char)(i + '0'); // adding char type key('0') to integer type i and then typecasting it into char since the board is char type

                    if (helper (board, nrow, ncol)) { // checking after placing number, does it return true (solution done or not)
                        return true;
                    }
                    else {
                        board[row][col] = '.'; // if its not true then keeping cell as blank
                    }
                }
            }
        }

        return false; // since none of the function/calls gave result as true
    }

    public void solveSudoku(char[][] board) {
        helper (board, 0, 0); // starting from first cell i.e. (0,0)
    }
}