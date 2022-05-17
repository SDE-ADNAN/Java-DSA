package com.adnan;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        // cyclic sort is only for range of numbers from 1 to n with all unique items
        // means u should know the start and end of the range..
        int[] arr = {3,5,2,1,4};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Cyclic(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
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
