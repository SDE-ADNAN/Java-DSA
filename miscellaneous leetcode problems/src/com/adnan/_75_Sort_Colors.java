package com.adnan;

import java.util.Arrays;

public class _75_Sort_Colors {
    public static void main(String[] args) {
        int[] arr = {1,0,1,2,2,1,0,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {
        /*
        intuition is that
        1. we traverse the array with three pointers start end and index
        2. index is the normal i type of iterator variable
        3. start , starts from index value 0 and increments only when
           the nums[index] == 0
        4. end starts from the end of the array and decrements only when the
           nums[index]==2


        */
        if (nums.length == 0 && nums.length == 1) return;

        int start = 0;
        int index = 0;
        int end   = nums.length-1;

        while(start<end && index<= end){
            if(nums[index]==0){
                // here we are swapping
                nums[index] = nums[start];
                // here assigning 0 to the nums[start]
                nums[start] = 0;
                start++;
                index++;
            }else if(nums[index] == 2){
                // here swapping
                nums[index] = nums[end];
                // assigning 2 as nums[end]
                nums[end] = 2;
                // decrementing end
                end--;
            }else{
//                this runs always when ever the loop runs
                index++;
            }
        }
    }
}
