package com.adnan;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
      int[] arr = {3,54,67,5,68,2,44,12,};
//      here we are not creating any other auxillary space or any other array to return the sorted  array
//      so the return type of the bubble function is void.
      bubble(arr);
      System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
//        for avoiding the over looping
        boolean swapped;
        // run the steps n-1 times
//        initially placing the i pointer at 0th index of the array
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            // and placing the j pointer at the 1st index i.e i+1 to compare the elements at
            // the ith and jth pointer and swap in case the j is smaller than the i element.
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swapping logic most imp for sorting algorithms
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }
}
