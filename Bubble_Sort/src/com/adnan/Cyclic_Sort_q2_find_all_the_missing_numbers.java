package com.adnan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cyclic_Sort_q2_find_all_the_missing_numbers {
    //leetcode #448
    // asked in google

    public static void main(String[] args) {
        // this array is ranging from [1,n] that's why we will apply cyclic sort here
        int[] arr ={4,3,2,7,8,2,3,1};
        List<Integer> ans = Cyclic(arr);
        Cyclic(arr);
        System.out.println(ans);
    }
    static List<Integer> Cyclic(int[] arr){
        // declaring the i pointer(for indexing elements of the array).
        int i = 0;
        while(i<arr.length){
            //                                                  {0,1,2,3,4,5,6,7,8}== index.
            // the correct number at correct index will be like {1,2,3,4,5,6,7,8,9}== value at index.
            int correct = arr[i]-1;
            // if arr item is not equal to the arr correct index then do swap.
            if(arr[i]!=arr[correct]) {
                // here we are swapping with the current value of the i pointer with its correct index to place it at the right place
                swap(arr, i, correct);
            }else{
                // else move forward.
                i++;
            }
        }

       // just find the missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length;index++) {
            // if arr[index] is not equal to index+1 then add that value to the ans list of integers.
            if(arr[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }


    // separate function for swapping the elements..
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
