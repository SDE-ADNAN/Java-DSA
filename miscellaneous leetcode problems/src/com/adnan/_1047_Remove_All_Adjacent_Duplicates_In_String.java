package com.adnan;

import java.util.Stack;
/*
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.



Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:

Input: s = "azxxzy"
Output: "ay"


Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.



*/

public class _1047_Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
     String s = "abbaca";
     String result = removeDuplicates(s);
        System.out.println(s);
        System.out.println(result);
    }
    static String removeDuplicates(String S) {

        Stack<Character> st = new Stack<>();

        // traversing the string after making a char array by using toCharArray on str
        for(char c : S.toCharArray()) {
            // checking if the stack is not empty
            if(!st.isEmpty()) {
                // if the stack is not empty and the curr char is at the top of the stack then we pop that element
                if(c == st.peek()) st.pop();
                    // else we push the char into the stack for further iterations
                else st.push(c);
                // else on every iteartion we push the char into the stack for further iterations
            } else st.push(c);
        }

        // after that we traverse the stack atlast and append that into a str build by using strbuilder
        StringBuilder builder = new StringBuilder();
        for(char c : st)
            builder.append(c);

        // then returning the builder's built str by using tostring() method
        return builder.toString();

    }
}
