package com.adnan;

public class _344_reverse_string {
    public static void main(String[] args) {

    }
    public static void reverseString(char[] s) {
        // we are just swapping between two pointers named left and right.

        int left = 0;
        int right = s.length-1;
        while(left<right){
            char temp = s[left];

            s[left++] = s[right];
            s[right--] = temp;

            // above two lines are equal to below four lines
            // s[left] = s[right];
            // s[right] = temp;
            // left++;
            // right--;
        }
    }
}
