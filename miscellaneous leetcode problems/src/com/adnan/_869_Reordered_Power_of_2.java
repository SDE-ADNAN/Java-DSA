package com.adnan;

import java.util.Arrays;

// tutorial used
// https://www.youtube.com/watch?v=PBf1qzkN6z8&ab_channel=AlgorithmsMadeEasy

public class _869_Reordered_Power_of_2 {
    public static void main(String[] args) {
        int n = 46;
        System.out.println(reorderedPowerOf2(n));
    }
    public static boolean reorderedPowerOf2(int N) {
        int[] countN = count(N);

        int nums = 1;

        for(int i = 0; i<31;i++){
            if(Arrays.equals(countN,count(nums))){
                return true;
            }
            nums = nums << 1;
        }

        return false;
    }
    static int[] count(int N){
        int[] arr = new int[10];
        while(N>0){
            arr[N%10]++;
            N /= 10;
        }
        return arr;
    }

}
