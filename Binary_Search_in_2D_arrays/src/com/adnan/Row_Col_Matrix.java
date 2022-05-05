package com.adnan;

import java.util.Arrays;

public class Row_Col_Matrix {

    public static void main(String[] args) {
        // the 2d array tobe traversed..
     int[][] arr={
             {10,20,30,40},
             {15,25,35,45},
             {28,29,37,49},
             {33,34,38,50},
     };

        System.out.println(Arrays.toString(search(arr,29)));
//        this will give [2,1] as ans as 29 exists at 3rd row and 2nd column but
        // due to indexing we get [2,1]

    }

    // we are returning an array with [row,column] index.
    static int[] search(int[][] matrix , int target){
        // taking the row to be 0 initially
        int r = 0;
        // taking the column number to be matrix.length -1 which gives as 4.
        int c = matrix.length-1;

        // running this while loop in case where row is smaller than the matrix.length
        // and until  column is bigger than or equal to 0.
        while(r < matrix.length && c >= 0 ){
            // here we are returning the r,c when current element is equal to target.
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c]< target){
                // incrementing the row count when current element is smaller than the target element
                r++;
            }else{
                // decrementing the column count when current element is bigger than the target element
                c--;
            }
            // else returning -1,-1 if element not found.
        }return new int[] {-1,-1};
    }
}
