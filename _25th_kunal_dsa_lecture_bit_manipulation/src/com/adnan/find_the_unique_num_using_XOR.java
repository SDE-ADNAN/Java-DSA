package com.adnan;

public class find_the_unique_num_using_XOR {
    public static void main(String[] args) {
        int[] arr = { 2,3,4,5,6,2,3,4,5} ;
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr){
        int unique =0;
        for (int n: arr
             ) {
            unique ^=  n;
        }
        return unique;
    }
}
