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
        // declaring the i pointer(for indexing elements of the array).
        int i = 0;
        while(i<arr.length){
            // this is the correct index at which the item should be present.
            int correct = arr[i]-1;
            // if the element is not present at the correct index then we swap..
            if(arr[i]!=arr[correct]) {
                swap(arr, i, correct);
            }else{
                // else we change the position of the i pointer to i+1..
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
