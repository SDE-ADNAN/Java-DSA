package com.adnan;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {3,54,67,5,68,2,44,12,};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j >0 ; --j) {
                // here we must use j--1 and not i instead
                if(arr[j]<arr[j-1]){
                    // here we must use j--1 and not i instead
                    swap(arr,j,j-1);
                }else{
                    // we are not comparing if j-1<than j as the array at lhs of j is already sorted
                    break;
                }
            }
        }
    }
    // separate function for swapping the elements..
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
