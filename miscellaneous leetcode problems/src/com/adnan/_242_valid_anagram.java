package com.adnan;

/*
242. Valid Anagram
Easy

6217

235

Add to List

Share
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false


Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/



public class _242_valid_anagram {
    public static void main(String[] args) {
        String s = "car";
        String t = "rac";

        System.out.println(anagram(s,t));

    }

    static boolean anagram (String s , String t){
        if(s.length()!= t.length()){
            return false;
        }

        int[] char_counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
//            here we are subtracting the ascii value of a with the characters index at each iteration and incrementing
            char_counts[s.charAt(i)-'a']++;
            //here we are subtracting the ascii value of a with the characters index at each iteration and decrementing
            char_counts[t.charAt(i)-'a']--;
        }

        for (int count:char_counts) {
            if(count !=0){
                return false;
            }
            
        }
        return true;
    }
}
