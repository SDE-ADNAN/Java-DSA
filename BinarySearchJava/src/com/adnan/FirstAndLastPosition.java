package com.adnan;

public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};

        //        check for first occurrence of target;
        int start = search(nums,target,true);
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
            int mid = start+(end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else{
//                    potential ans found
                ans = mid;
                if(FindStartIndex){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;

    }
}
