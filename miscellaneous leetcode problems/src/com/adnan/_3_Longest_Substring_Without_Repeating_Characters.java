package com.adnan;

/*
 EXPLAINATION
So, the prerequisit of this problem is Sliding Window, if you know then it's a plus point. But, if you don't know don't worry I'll try to teach you.

Let's understand first of all what the problem is saying!!

Given a string s, find the length of the longest substring without repeating characters.
Okay, so from the given statement we will try to find out wether it is a Sliding Window problem or not>>

So, to check that out I'm giving you a tempelate & it'll work in almost all of the questions of sliding window

To, find out a sliding window problem :-
> First thing is, we have given something like an "Array" | OR | "String"
> Second thing is, they are talking about either "subsequence" | OR | "substring"
> And third most thing is, either we have given a "window size i.e. k" | OR | we have to "manually find out window size"
Now, using above keys let's understand wether this problem is of a sliding window or not.

> Are they talking about, "Array" or "String" --> yes they are talking about "string" +1 point
> Are they asking to find out "subsequence" or "substring" --> yes they are talking about "substring" +1 point
> Do, we have given a window size --> No, we don't have

Total score is "2 / 3" so, it's a 100% sliding window problem. If your score lies from 2/3 to 3/3 that's a gauranteed sliding window problem
Now, let's talk about how we gonna implement sliding window in this problem, but before that I just want to tell you one more thing. There's exist basically 2 types of sliding window.

Fix size sliding window {means K is given}

Variable silze sliding window {means K is not given}

Before moving to the problem I want to give you a template which you can use in any sliding window {Variable size} problem

while(j < size()){

    // Calculation's happen's here
-----------------------------------------------
    if(condition < k){
        j++;
    }
-----------------------------------------------

-----------------------------------------------
    else if(condition == k){
        // ans <-- calculation
        j++;
    }
----------------------------------------------

----------------------------------------------
    else if(condition > k){
        while(condition > k){
            // remove calculation for i
            i++;
        }
        j++;
    }
----------------------------------------------
}
return ans;
So, in this problem we gonna deal with variable size sliding window. Let's take one example :-

Input: s = "abcabcbb"
Output: 3
So, inorder to solve this, what I'm thinking is, we should have to use one more Data Structure to store the occurence of these characters, I thing HashMap will be best to use.

Now, what I'll do is create 2 pointer's i & j initally they both start from 0
The j pointer will helps us to fill the array while the i pointer will helps in removing from the map {Don't know what I'm talking about} just wait. You'll understand :)
Let's understand it visually :-



image1 https://assets.leetcode.com/users/images/664cc9c6-1440-4b88-a11f-ca27a67b5266_1654838647.047003.png

image2 https://assets.leetcode.com/users/images/088afd9c-bc21-46ca-b651-a46a75c02c4e_1654838698.0517573.png

image3 https://assets.leetcode.com/users/images/61717331-f54a-4940-9000-2bf95dc8af56_1654838746.162897.png

image4 https://assets.leetcode.com/users/images/3c62fa7f-e7e3-4063-b306-0a3495071004_1654838786.1087303.png

image5 https://assets.leetcode.com/users/images/c1aae088-b5e1-4328-aa1f-af414b0ef112_1654838837.5751796.png

image6 https://assets.leetcode.com/users/images/fe893a02-e560-4a8f-aaa1-f92e55dd35cd_1654838885.7713046.png

image7 https://assets.leetcode.com/users/images/6a268e77-c099-4f01-b0d5-136995310d3f_1654838919.9853337.png

image8 https://assets.leetcode.com/users/images/6811ecde-9e2a-47e6-b688-682bb3f0f5a2_1654838956.3712077.png

image9 https://assets.leetcode.com/users/images/a751f95a-f42b-4922-9609-c88ad5f339fb_1654838991.3203616.png

image10 https://assets.leetcode.com/users/images/f789c5cb-3e73-449e-80de-38f61d5404b9_1654839058.5881085.png

image11 https://assets.leetcode.com/users/images/65c28458-d89a-4008-afde-264598e4d127_1654839089.2232268.png

image12 https://assets.leetcode.com/users/images/2fb45c3b-a510-4a3b-be1d-02a53fc0ff02_1654839123.2810624.png

image13 https://assets.leetcode.com/users/images/5c80c220-70d8-4a9e-9689-a7cd1fb9e11d_1654839162.3931215.png

image14 https://assets.leetcode.com/users/images/b10fc6ab-9f8b-4035-bfbf-5b9e4cca3cb0_1654839175.0759387.png

Java

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(map.size() == j - i + 1){
                max = Math.max(max, j - i + 1);
                j++;
            }
            else if(map.size() < j - i + 1){
                while(map.size() < j - i + 1){
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}

*/

import java.util.HashMap;
import java.util.Map;

/*


*/

public class _3_Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(map.size() == j - i + 1){
                max = Math.max(max, j - i + 1);
                j++;
            }
            else if(map.size() < j - i + 1){
                while(map.size() < j - i + 1){
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
