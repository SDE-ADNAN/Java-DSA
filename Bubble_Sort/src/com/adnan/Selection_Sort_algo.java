package com.adnan;

import java.util.Arrays;

public class Selection_Sort_algo {
    public static void main(String[] args) {
        int[] arr = {3,54,67,5,68,2,44,12,};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
// main function
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max element from the array and place it inthe end of the array ..
            int last = arr.length-i-1;
            int max = getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }

    // getting the max element index
    static int getMaxIndex(int[] arr,int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[max]< arr[i]){
                max = i;
            }
        }
        return max ;
    }

    // separate function for swapping the elements..
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



}
