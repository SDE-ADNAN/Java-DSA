package com.adnan;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arrAscc ={-10,-7,-5,-3,-1,0,1,3,6,8,10};
        int[] arrDesc ={10,9,8,7,6,5,4,3,2,1};
        int target = 1;
        int ans1 = OABS(arrDesc,target); // OABS==OrderAgnosticBInarySearch
        int ans2 = OABS(arrAscc,target); // OABS==OrderAgnosticBInarySearch

        System.out.println(ans1);
        System.out.println(ans2);
    }

    private static int OABS(int[] arr, int target) {

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
        return -1;
    }
}
