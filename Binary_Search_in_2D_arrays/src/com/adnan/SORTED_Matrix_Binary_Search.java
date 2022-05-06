package com.adnan;

import java.util.Arrays;

public class SORTED_Matrix_Binary_Search {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
        int[][] arr={{1}};
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binarySearch(matrix,0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}





//    second approach
//public static void main(String[] args) {
//    int[][] arr={
//            {1,2,3,4},
//            {5,6,7,8},
//            {9,10,11,12},
//            {13,14,15,16},
//    };
//
//    System.out.println(Arrays.toString(searchMatrix(arr,2)));
//        System.out.println(arr[0].length);
//    static int[] searchMatrix(int[][] matrix, int target) {
//        int low = 0;
//        int high = (matrix.length*matrix[0].length)-1;
//        while(low<=high){
//            int middle = low +(high-low)/2;
//            System.out.println("middle"+middle);
//            int row = middle/matrix[0].length;
//            System.out.println("row"+row);
//            int col = middle%matrix[0].length;
//            System.out.println("col"+col);
//            if(matrix[row][col]==target){
//                return new int[]{row,col};
//            }else if(matrix[row][col]>target) high = middle-1;
//            else low = middle+1;
//        }
//        return new int[]{-1,-1};
//    }
//}
