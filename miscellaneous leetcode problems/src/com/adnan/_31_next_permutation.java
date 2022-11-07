package com.adnan;

public class _31_next_permutation {
    /*
    Approach
We can follow the below steps -

Scan the array from right to left until an element is found which is smaller than the index at its right. Mark the index of such element as index.
Again scan the array from right to left until an element is found which is greater than the element found in the above step. Mark the index of such elements as j.
Swap the two elements at indices index and j.
Now, reverse the array from index index until the end of the array.
Let’s understand this with an example -

nums = [4,5,3,2,1]

Step 1: scan from right to left and stop at 4 because it less than 5. Here, index = 0
Step 2: Again scan from right to left and stop at 5 because it is greater than 4. Here, j = 1
Step 3: Swap the elements at index and j. The array will become [5,4,3,2,1].
Step 4: Reverse the array after index. The array will become [5,1,2,3,4]
Time Complexity
We are iterating the array two times. In the worst case, the time complexity will be O(2n) which is equivalent to O(n).

Space Complexity
We are not using any data structure for intermediate computations. Hence, the space complexity will be O(1).
    */
    public static void main(String[] args) {

    }
    public void nextPermutation(int[] nums) {
        // Length of the array
        int n = nums.length;
        // Index of the first element that is smaller than
        // the element to its right.
        int index = -1;
        // Loop from right to left
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }
        // Base condition
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        int j = n - 1;
        // Again swap from right to left to find first element
        // that is greater than the above find element
        for (int i = n - 1; i >= index + 1; i--) {
            if (nums[i] > nums[index]) {
                j = i;
                break;
            }
        }
        // Swap the elements
        swap(nums, index, j);
        // Reverse the elements from index + 1 to the nums.length
        reverse(nums, index + 1, n - 1);
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int index) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }
}
