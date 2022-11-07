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


     */
}
