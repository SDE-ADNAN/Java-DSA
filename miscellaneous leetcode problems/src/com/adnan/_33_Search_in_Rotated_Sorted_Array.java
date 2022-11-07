package com.adnan;

public class _33_Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {

    }
    /*
       Analysis
   This question is an extension of the binary search. The only catch here is that the array is rotated from an unknown index k. For e.g., let’s say we have a sorted array A = [1, 2, 3, 4, 5, 6], and if I rotated it from index 3 then it will become A = [4, 5, 6, 1, 2, 3].

   This still gives an illusion of an unsorted array, but it isn’t actually if we can find the index from where it is sorted.

   Approach
   The approach is simple if we are able to find the index from where the given array is rotated. We can follow below steps to solve this problem —

   Find the index where the array is rotated. Notice if a sorted array is rotated then the rightmost element will not be the biggest element in the array.
   Using the information in step #1, we can perform binary search to find the index where the array is rotated.
   Once we have found that index, then we can easily determine in which half (array will be divided into two halves by the pivot index) of the array the target lies.
   Notice, the two halves are themselves will be sorted (this is pretty intuitive, right \U0001f604?).
   We can then perform binary search once again in the determined half to find the index of the target element.
   Time Complexity
   Since we are discarding one half of the array after every iteration, the time complexity will be O(log n).

   Space Complexity
   We are not using any data structure for intermediate calculations, hence the space complexity would be O(1).
       */
    public int search(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // Left and right pointers in the array
        int left = 0;
        int right = nums.length - 1;
        // First step is to find the pivot where the
        // array is rotated
        while (left < right) {
            // Middle pointer
            int middle = left + (right - left) / 2;
            // If the element at the mid is greater than
            // the element at the right then we can say that
            // the array is rotated after middle index
            if (nums[middle] > nums[right]) {
                left = middle + 1;
            }
            // Else, the pivot is in the left part
            else {
                right = middle;
            }
        }
        // After the above loop is completed, then the
        // left index will point to the pivot
        int pivot = left;
        left = 0;
        right = nums.length - 1;
        // Now we will find in which half of the array,
        // our target is present
        if (target >= nums[pivot] && target <= nums[right]) {
            left = pivot;
        } else {
            right = pivot;
        }
        // Now perform normal binary search
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
