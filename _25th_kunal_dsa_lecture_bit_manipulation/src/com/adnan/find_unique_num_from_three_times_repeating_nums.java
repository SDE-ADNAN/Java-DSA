package com.adnan;

public class find_unique_num_from_three_times_repeating_nums {
    public static void main(String[] args) {
        int[] nums ={1,1,1,2} ;
        System.out.println(findSingle(nums,3));
    }
    static int findSingle(int[] nums, int n) {
        // ignore all the cases where array size is less than 3
        if(n<3) {
            return -1;
        }

        /*
         *	we keep ones for first occurence of the element
         *	we keep twos for second occurence of the same element found earlier.
         *	when ones and twos reset back to original then element occured 3 times
         */
        int ones = 0, twos = 0;
        for(int i=0;i<n;i++) {
            ones = (ones ^ nums[i]) & (~twos);
            twos = (twos ^ nums[i]) & (~ones);
        }
        return ones; // ones contains the element which occured once
    }
}
