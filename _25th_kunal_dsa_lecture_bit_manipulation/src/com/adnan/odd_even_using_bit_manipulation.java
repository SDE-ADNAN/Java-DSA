package com.adnan;



public class odd_even_using_bit_manipulation {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(is_Odd(n));
    }

    private static boolean is_Odd(int n) {
        return (n & 1) ==1;
    }

    private static boolean is_even(int n) {
        return (n & 1) !=1;
    }
}
