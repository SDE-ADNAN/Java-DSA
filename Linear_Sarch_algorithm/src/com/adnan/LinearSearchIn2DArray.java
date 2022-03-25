package com.adnan;

import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12},
        };

        int target =344;
        int[] ansArr = search(arr,target);

        System.out.println(Arrays.toString(ansArr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target)
//                    returning the row index and col index of the 2d array in another array
                return new int[]{row,col};
            }

        }
//        if target not found return -1 in a new array
        return new int[]{-1};
    }
}
