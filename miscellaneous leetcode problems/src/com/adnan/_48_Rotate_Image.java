/*

48. Rotate Image
Medium

11968

572

Add to List

Share
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.



Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:


Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]


Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000

  */


package com.adnan;

public class _48_Rotate_Image {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        rotate(arr);
        print2D(arr);
    }
    public static void rotate(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length-1;

        //At first reverse the matrix from bottom to top
        // e.g
        // aproach is straight forward.
        // 1,2,3      7,8,9      7,4,1
        // 4,5,6  ==> 4,5,6  ==> 8,5,2
        // 7,8,9      1,2,3      9,6,3
        // in last step we swapped each element ignoring the diagonal.

        while(top<bottom){
            int[] temp = matrix[top];
            matrix[top] = matrix[bottom];
            matrix[bottom] = temp;
            top++;
            bottom--;
        }

        // after switch top & bottom the 2D matrix should liik like below
        // 7,4,1
        // 4,5,6
        // 1,2,3
        // because the line 7,5,3 is already correct
        // swap 8,9,6 <--> 4,1,2  but only once

        for(int i =0;i<matrix.length;i++){
            for(int j = i+1 ; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
    static void print2D (int[][] matrix){
        for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
    }
}
