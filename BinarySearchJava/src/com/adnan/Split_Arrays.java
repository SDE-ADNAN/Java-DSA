package com.adnan;

/*
link--"https://leetcode.com/problems/split-array-largest-sum/"
410. Split Array Largest Sum
Hard

5740 --likes

150 --dislikes.

Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.

Write an algorithm to minimize the largest sum among these m subarrays.



Example 1:

Input: nums = [7,2,5,10,8], m = 2
Output: 18
Explanation:
There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8],
where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], m = 2
Output: 9
Example 3:

Input: nums = [1,4,4], m = 3
Output: 4


Constraints:

1 <= nums.length <= 1000
0 <= nums[i] <= 106
1 <= m <= min(50, nums.length)

*/

// this question is very complicated as we are not able to differentiate among the options of whether to use binary search
// or not to use binary search in this question this must be done multiple times to be remembered .

// Explaination:----
// we have to find the best distribution combination in which the splitted sub-array must contain less amount
// of items but must have maximum sum when compared to other sub-arrays.

public class Split_Arrays {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};

        System.out.println(splitArray(nums,3));
    }

    static int splitArray(int[] nums, int m){
        // start and end are initially zero,
        // but later they will resemble the min and max where
        // min == minimum value that can be formed(max individual item in the array)
        // max == max value that can be formed(by adding all the items of the array)
        // so
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]); // this will contain max item of the array in the end of loop
            // adding all the items and storing in end after the completion of the loop
            end += nums[i];
        }

        // Now we will perform binary search on the given array using start and end returned from the upper loop
        // so
        while(start<end){
            // try for the middle as potential ans
            int mid = start+(end-start)/2;

            // now calculate how many pieces u can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    // this means u cannot add this num to the current sub-array, make new sub-array
                    // say u add this in new subarray , then sum == num
                    sum  = num;
                    pieces++;
                }else{
                    sum +=num;
                }
            }
            if(pieces > m){
                start = mid +1;
            }else{
                end = mid;
            }
        }
        return end; // here start == end == mid
    }
}
