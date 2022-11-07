package com.adnan;
/*
916. Word Subsets
Medium

2009

177

Add to List

Share
You are given two string arrays words1 and words2.

A string b is a subset of string a if every letter in b occurs in a including multiplicity.

For example, "wrr" is a subset of "warrior" but is not a subset of "world".
A string a from words1 is universal if for every string b in words2, b is a subset of a.

Return an array of all the universal strings in words1. You may return the answer in any order.



Example 1:

Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","o"]
Output: ["facebook","google","leetcode"]
Example 2:

Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["l","e"]
Output: ["apple","google","leetcode"]


Constraints:

1 <= words1.length, words2.length <= 104
1 <= words1[i].length, words2[i].length <= 10
words1[i] and words2[i] consist only of lowercase English letters.
All the strings of words1 are unique.


*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _916_Word_subsets {
    public static void main(String[] args) {
         String[] words1 = {"amazon","apple","facebook","google","leetcode"};
         String[] words2 ={"e","o"};

         List<String> result = new ArrayList<>();

         int[] target = new int[26];

        for (String b:words2) {
            int[] temp = new int[26];
            for(char c:b.toCharArray()){
                temp[c-'a']++;
                target[c-'a']=Math.max(target[c-'a'],temp[c-'a']);
            }
        }

        for(String a:words1){
            int[] arr = new int[26];
            for(char c:a.toCharArray()) arr[c-'a']++;
            if(subset(arr,target)) result.add(a);
        }

        String k[] = result.toArray(new String[result.size()]);

        System.out.println(Arrays.toString(k));
    }

    static boolean subset(int[] source,int[] dest){
        for(int i=0;i<26;i++){
            if(dest[i]>source[i]) return false;
        }
        return true;
    }
}
