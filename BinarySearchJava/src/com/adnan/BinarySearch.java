package com.adnan;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr ={-10,-7,-5,-3,-1,0,1,3,6,8,10};
        int target = 3;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr ,int  target){
        int start = 0;
        int end = arr.length -1;
        while(start <=end){
//         find the middle element
//            int mid = (start+end)/2; // this may lead to mid exceeding the max capacity of int and throw error;
            int mid = start+(end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
//                     ans found
                return mid;
            }
        }
        return -1;


    }
}
