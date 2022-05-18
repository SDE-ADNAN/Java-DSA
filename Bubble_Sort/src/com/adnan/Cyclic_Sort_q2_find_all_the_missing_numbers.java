package com.adnan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cyclic_Sort_q2_find_all_the_missing_numbers {
    // asked in google

    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        List<Integer> ans = Cyclic(arr);
        Cyclic(arr);
        System.out.println(ans);
    }
    static List<Integer> Cyclic(int[] arr){
        // declaring the i pointer(for indexing elements of the array).
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

       // just find the missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length;index++) {
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
