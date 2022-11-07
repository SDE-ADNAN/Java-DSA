package com.adnan;


import java.util.Arrays;

/*

189. Rotate Array
Medium

10836

1387

Add to List

Share
Given an array, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]


Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105


Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
  */
public class _189_Rotate_Array {
    public static void main(String[] args) {
     int[] nums = {1,2,3,4,5,6,7};
     int k = 3;
     rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums ,int k) {
        System.out.println(k);
        k = k % nums.length;
        System.out.println(k);
        // reversing the array from 0 to its full length which will rotate the full array
        reverse(nums,0,nums.length-1);
        // reversing elements from 0th index till the k-1th element
        reverse(nums,0,k-1);
        // again resetting/reversing  the array from kth index to the full length of the array
        reverse(nums, k , nums.length-1);
    }
    public static void reverse(int[] nums ,int start ,int end){
        // here we are just swapping between the start and end indices.
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
