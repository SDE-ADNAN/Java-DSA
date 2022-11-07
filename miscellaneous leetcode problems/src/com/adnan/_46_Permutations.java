package com.adnan;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

tutorial used: https://www.youtube.com/watch?v=R3Sm9V2OSCo&ab_channel=Codebix

46. Permutations
Medium

12579

215

Add to List

Share
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]


Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.

*/
public class _46_Permutations {

    public static void main(String[] args) {
int[] nums = {1,2,3};
        System.out.println(solution(nums));
    }

    public static List<List<Integer>> solution(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        System.out.println(Arrays.toString(visited));
        backtrack(res, nums,new ArrayList(),visited);
        return res;
    }

    static void backtrack(List<List<Integer>> res, int[] nums, List<Integer> curr, boolean[] visited){
        // base case to check if the curr array's length is equal to the innput i.e the nums array.length
        if(curr.size() == nums.length){
            // adding the formed permutation array to the res array
            res.add(new ArrayList<>(curr));
            // terminating the recursive call stack.
            return;
        }

        // main logic
        // this will go from 0 to the length of the input i.e the nums array
        for(int i=0;i<nums.length; i++){
            // if the ith index of visited is true then skip that iteration.
            if(visited[i] == true) continue;
            // adding the ith element in the nums arrayList
            curr.add(nums[i]);
            // and turning that specific element at that index true to say that it is visited
            visited[i] = true;
            // again making recursive call to make the recursive tree
            backtrack(res,nums,curr,visited);
            // removing the last element from the curr array
            curr.remove(curr.size()-1);
            // and making that false atlast
            visited[i] = false;
        }
    }
}
