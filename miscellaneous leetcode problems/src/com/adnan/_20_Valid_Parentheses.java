package com.adnan;

import java.util.HashMap;
import java.util.Stack;

public class _20_Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        char[] sArr = s.toCharArray();

        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');

        Stack<Character> st = new Stack<>();

        for(char c : sArr) {
            if (!hm.containsKey(c)) {
                System.out.println(c);
                st.push(c);
            } else {
                if (st.isEmpty() || st.pop() != hm.get(c)) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }}
