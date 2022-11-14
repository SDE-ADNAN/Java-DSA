package com.adnan;

import java.util.HashMap;
import java.util.Stack;

/*
Valid Parentheses
Category	Difficulty	Likes	Dislikes
algorithms	Easy (40.86%)	16699	859
Tags
string | stack

Companies
airbnb | amazon | bloomberg | facebook | google | microsoft | twitter | zenefits

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

public class _20_Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        // here basically the idea is
        // 1. declare a stack and put all the opening parenthesis on each occurance
        // 2. traverse the char array if you find a valid closing parenthesis for
        //    the stack.top() element then simply pop() it and continue traversing.
        // 3. if u not find a valid closing paranthesis then return false.

        // here we are checking if the str length is divisible by 2 , as by commonsense if we need a balanced
        // str of parenthesis then each opening parenthesis must have a closing parenthesis which forms
        // a pair and a pair is always divisible by 2.
        if (s.length() % 2 != 0) {
            return false;
        }


        // forming the char array from the parameter str s
        char[] sArr = s.toCharArray();

        // creating a hashmap for later check of valid pair of parenthesis
        HashMap<Character, Character> hm = new HashMap<>();
        // here on calling the hm.containsKey(c) and if c = ) we will get ( in ans
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');

        // stack for simultaneous  push and pop of parenthesis
        Stack<Character> st = new Stack<>();

        for(char c : sArr) {
            // if hm not has key c in it then only we push it into the stack which will be offcourse
            // "(" or "[" or "{"
            if (!hm.containsKey(c)) {
                st.push(c);
            } else {
                // else if the stack is empty before we reach the length of the char array then it
                // means we found a closing parenthesis before a opening one which is invalid
                // and also if the top element of the stack is not equal to the value of a key in
                // hm (hashmap) then also it is not valid
                if (st.isEmpty() || st.pop() != hm.get(c)) {
                    return false;
                }
            }
        }

        // in the end after all this circus if the stack is empty then the str is a valid parenthesis
        // or if the stack is not empty then simply this st.isEmpty() will return false. which means
        // stack has elements even after traversing the complete str
        return st.isEmpty();
    }}
