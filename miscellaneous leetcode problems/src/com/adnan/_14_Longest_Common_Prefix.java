package com.adnan;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.

*/

public class _14_Longest_Common_Prefix {

    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    /*
    For a start we will describe a simple way of finding the longest prefix shared by a set of strings
     LCP(S(1)......S(n)). We will use the observation that :

     LCP(S(1)......S(n))=LCP(LCP(LCP(S(1)...S(2)),S(3)),...S(n))

     **Algorithm**

     To employ this idea, the algorithm iterates through the strings [S1…Sn],
     finding at each iteration i the longest common prefix of strings  LCP(S1…Si).
     When LCP(S1…Si) is an empty string, the algorithm ends. Otherwise after n iterations,
     the algorithm returns LCP(S1…Sn).

     iteration 1 {[leets,leetcode],leet,leeds}

     LCP{1,2} leets and leetcode has leet in similar  so resultant for this iteration is "leet"

     iteration 2 {leets,leetcode,[leet],leeds}

     LCP{1,3} resultant "leet" and 3rd item "leet" have all letters in same so resultant remains the same

     iteration 3 {leets,leetcode,leet,[leeds]}

     LCP{1,4} resultant "leet" and 4th item "leeds" have "lee" in similar therefore "lee" is the new resultant
     as now the loop through the array is completed then we return the last resultant.


    Complexity Analysis

    Time complexity : O(S), where S is the sum of all characters in all strings.

    In the worst case all nnn strings are the same. The algorithm compares the string S1
    with the other strings [S2…Sn]There are S character comparisons,
    where S is the sum of all characters in the input array.

    Space complexity : O(1). We only used constant extra space.
     */


    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}


