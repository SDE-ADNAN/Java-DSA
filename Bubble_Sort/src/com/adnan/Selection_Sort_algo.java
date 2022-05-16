package com.adnan;

import java.util.Arrays;

public class Selection_Sort_algo {
    public static void main(String[] args) {
        int[] arr = {3,54,67,5,68,2,44,12,};
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max element from the array and place it inthe end of the array ..
            int last = arr.length-i-1;
            int max = getMaxIndex(arr,0,last);
        }
    }

    private static int getMaxIndex(int[] arr,int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[max]< arr[i]){
                max = i;
            }
            
        }
    }

}
