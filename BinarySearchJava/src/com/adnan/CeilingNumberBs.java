package com.adnan;

public class CeilingNumberBs {
    public static void main(String[] args) {
        int[] arrAscc ={2,3,5,9,14,16,18};
        int target = 22;
        int ans2 = Ceiling(arrAscc,target); // OABS==OrderAgnosticBInarySearch

        System.out.println(ans2);
    }
    // return the index of smallest no >= target
    private static int Ceiling(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length -1;
        boolean IsAsccending = arr[start]<arr[end];

        while(start <=end){
//         find the middle element
//            int mid = (start+end)/2; // this may lead to mid exceeding the max capacity of int and throw error;
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(IsAsccending){
                if(target < arr[mid]){
                    end = mid-1;
                }else if(target > arr[mid]){
                    start = mid +1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }else if(target < arr[mid]){
                    start = mid +1;
                }
            }
        }
//        just changed this below line from return -1 to return start abd the ceiling problem is solved ;
        return start;
    }
}
