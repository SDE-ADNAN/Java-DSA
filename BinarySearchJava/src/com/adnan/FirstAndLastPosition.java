package com.adnan;

import java.util.Arrays;

/*

this problem is about finding the targets start and end indices when it is continuously repeating
like int[] arr1 = {1,2,3,3,3,4,5,6,6,6,6,6,7,8,9};
                     here 3 and 6 are repeating
                     so the ans must be
                     for 3 == start = 2 and end = 4
                              whereas for 6
                     it must be 6 == start = 7 and end = 11;

 **Note : time complexity must be O(log n) (this statement is as a hint to use binary search as binary
          search has time complexity of O(log n))

* */

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,3,4,5,6,6,6,6,6,7,8,9};

        int[] ans = searchRange(arr1,6);

        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};

        //        check for first occurrence of target;
        int start = search(nums,target,true);
        // check for the second occurrence of the target;
        int end = search(nums,target,false);
        ans[0]=start;
        ans[1]=end;

        return ans;

    }

//    this function just returns the index value of target;
    static int search(int[] nums, int target, boolean FindStartIndex){

        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <=end){
//         find the middle element
//            int mid = (start+end)/2; // this may lead to mid exceeding the max capacity of int and throw error;
            int mid = start+(end-start)/2; // this will not throw any error
            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else{
//                    potential ans found
                ans = mid;
                if(FindStartIndex){
//                    if searching for the first most occurrence then decrementing the end pointer
                    end = mid -1;
                }else{
//                    if searching for the end  most occurrence then incementing the start pointer
                    start = mid+1;
                }
            }
        }
        return ans;

    }
}
