package com.adnan;

public class minValueInArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(ans > arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
