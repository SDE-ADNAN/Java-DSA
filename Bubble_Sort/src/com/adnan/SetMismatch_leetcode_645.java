package com.adnan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch_leetcode_645 {
    public static void main(String[] args) {
        int[] arr ={1,1};
        System.out.println(Arrays.toString(findDuplicates(arr)));
    }

    static int[] findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            // searching for the misplaced item
            if (arr[index] != index+1) {
                // adding it to the ans arraylist
                return new int[] {arr[index],index+1};
            }
        }

        return new int[] {-1,-1};
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
