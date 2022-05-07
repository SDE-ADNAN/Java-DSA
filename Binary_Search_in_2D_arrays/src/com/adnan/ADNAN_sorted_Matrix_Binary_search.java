package com.adnan;

import java.util.Arrays;

public class ADNAN_sorted_Matrix_Binary_search {
    public static void main(String[] args) {
//        int[][] arr={
//            {0,2,3,4},
//            {5,6,7,8},
//            {9,10,11,12},
//            {13,14,15,16},
//            {18,19,20,99},
//        };
        int[][] arr={{1}};
        System.out.println(Arrays.toString(innerBs(arr,10)));
        boolean isPresent = false;

    }
    static int outerBS (int[][]arr,int target){
        int start = 0;
        int end = arr.length -1;
        // here rStart
        int rStart = arr[start][0];
        int rEnd = arr[0].length -1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(arr[mid][0] <=target && arr[mid][arr[mid].length-1]>=target){
                return mid;
            }
            if(arr[mid][0] <=target && arr[mid][arr[mid].length-1] <=target){
                start = mid +1;
            }else if(arr[start][0] >=target && arr[start][arr[mid].length-1]>=target){
                end = mid-1;
            }

        }
        return -1;
    }
    static int[] innerBs(int[][]arr,int target){
        int ansArr = outerBS(arr,target);
        if(ansArr == -1){
            return  new int[] {-1,-1};
        }
        int start = 0;
        int end = arr[0].length -1;;
        while(start<=end){
            int mid = start +(end -1)/2;
            if(arr[ansArr][mid]==target){
                return new int[] {ansArr,mid};
            }
            if(arr[ansArr][mid]<target){
                start =mid +1;
            }else if(arr[ansArr][mid]>target){
                end =mid-1;
            }
        }
        return new int[] {-1,-1};
    }
}
