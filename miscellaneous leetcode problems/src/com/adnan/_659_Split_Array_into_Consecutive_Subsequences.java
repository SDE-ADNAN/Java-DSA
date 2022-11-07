package com.adnan;

/*
You are given an integer array nums that is sorted in non-decreasing order.

Determine if it is possible to split nums into one or more subsequences such that both of the following conditions are true:

Each subsequence is a consecutive increasing sequence (i.e. each integer is exactly one more than the previous integer).
All subsequences have a length of 3 or more.
Return true if you can split nums according to the above conditions, or false otherwise.

A subsequence of an array is a new array that is formed from the original array by deleting some (can be none) of the elements without disturbing the relative positions of the remaining elements. (i.e., [1,3,5] is a subsequence of [1,2,3,4,5] while [1,3,2] is not).



Example 1:

Input: nums = [1,2,3,3,4,5]
Output: true
Explanation: nums can be split into the following subsequences:
[1,2,3,3,4,5] --> 1, 2, 3
[1,2,3,3,4,5] --> 3, 4, 5
Example 2:

Input: nums = [1,2,3,3,4,4,5,5]
Output: true
Explanation: nums can be split into the following subsequences:
[1,2,3,3,4,4,5,5] --> 1, 2, 3, 4, 5
[1,2,3,3,4,4,5,5] --> 3, 4, 5
Example 3:

Input: nums = [1,2,3,4,4,5]
Output: false
Explanation: It is impossible to split nums into consecutive increasing subsequences of length 3 or more.


Constraints:

1 <= nums.length <= 104
-1000 <= nums[i] <= 1000
nums is sorted in non-decreasing order.

  */

import java.util.Arrays;
import java.util.PriorityQueue;


// followed for solving.
//https://www.youtube.com/watch?v=48dVSYcab0U&ab_channel=Tier3

public class _659_Split_Array_into_Consecutive_Subsequences {
    public static void main(String[] args) {
      int[]  nums = {1,2,3,3,4,5};

        System.out.println(isPossible(nums));
    }

    private static boolean isPossible(int[] nums) {
        //using a priority queue wit conditions
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->{
            // this is a comparator which is used to compare two items in a priority queue
            // here if 1st index of a is equal to 1st index of b then
            if(a[1] == b[1]){
                // here la is length of the array "a" if a[1,5] then a[1]=5 and a[0]=1 then
                // 5-1+1=5 which is the size of the array
                int la = a[1] -a[0] +1;
                // lb is size of array"b"
                int lb = b[1] -b[0] +1;
                // swapping in descending
                return la-lb;
            }
            // else we are swapping in ascending
            return a[1] - b[1];
        });

        // looping through nums items
        for (int i: nums) {
            // while pq size is bigger than 0 and pq's heads size is smaller than i
            while(pq.size() > 0 && pq.peek()[1]+1<i){
                // remove that element from the queue
                int[] r = pq.remove();
                // if r.length < 3 return false as we need subsequences with length more than or equal to 3
                if(r[1]-r[0]+1 <3){
                    return false;
                }
            }
            // pq.size is equal to 0  or pq s head[1] is equal to i
            if(pq.size()==0 ||pq.peek()[1]==i){
                // add new subsequence
                pq.add(new int[] {i,i});
            }else{
                // else remove the head subsequence and add new from 0
                int[] pr = pq.remove();
                pq.add(new int[] {pr[0],i});
            }
        }
        while(pq.size() >0){
            int[] s = pq.remove();
            System.out.println(Arrays.toString(s));
            if(s[1]-s[0]+1 <3){
                return false;
            }
        }

        return true;
    }
}
