package com.adnan;

import java.util.Arrays;

public class ADNAN_sorted_Matrix_Binary_search {
    public static void main(String[] args) {
//        int[][] arr={
//            {1,2,3,4},
//            {5,6,7,8},
//            {9,10,11,12},
//            {13,14,15,16},
//            {17,18,19,20},
//        };
        int[][] arr={{1}};
        System.out.println(Arrays.toString(innerBs(arr,10)));
        boolean isPresent = false;

    }
    static int outerBS (int[][]arr,int target){
        int start = 0;
        int end = arr.length -1;
        int rStart = arr[start][0];
        int rEnd = arr[0].length -1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(arr[mid][rStart] <=target && arr[mid][rEnd]>=target){
                return mid;
            }
            if(arr[mid][rStart] <=target && arr[mid][rEnd] <=target){
                start = mid +1;
            }else if(arr[start][rStart] >=target && arr[start][rEnd]>=target){
                end = mid-1;
            }

        }
        return -1;
    }
    static int[] innerBs(int[][]arr,int target){
        int ansArr = outerBS(arr,target);
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
