package com.adnan;

import java.util.Stack;

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
