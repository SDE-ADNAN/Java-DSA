package com.adnan;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {3,54,67,5,68,2,44,12,};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }



    // separate function for swapping the elements..
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
