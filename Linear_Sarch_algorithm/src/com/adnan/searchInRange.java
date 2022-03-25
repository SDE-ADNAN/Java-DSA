package com.adnan;

public class searchInRange {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//       int ans = linearSearch(arr, 6);
        int ans = searchInRange(arr, 3,1,4);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr ,int target){

        // if array is empty
        if(arr.length == 0){
            return -1;
        }

        // for searching
        for (int index = 0; index < arr.length; index++) {
            // check for element at each index if it is == target
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
        return -1;
    }


//    for search in a given range (returns element if present)
    static int searchInRange(int[] arr ,int target, int start,int end){

        // if array is empty
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        for (int i = start; i <= end ; i++) {
            int element = arr[i];
            if(element == target){
                return element;
            }

        }
        return Integer.MAX_VALUE;
    }

}
