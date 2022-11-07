package com.adnan;

import java.util.ArrayList;
import java.util.List;

public class _22_generating_paranthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

        /*

        Problem Statement
    Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

    Constraints:
    1 ≤ n ≤ 8
    Examples
    Example 1:

    Input: n = 3
    Output: ["((()))","(()())","(())()","()(())","()()()"]
    Example 2:

    Input: n = 1
    Output: ["()"]
    Analysis
    The problem description is fairly straight forward (however the solution may not be 😛). We will be given a number n which represents the pairs of parentheses, and we need to find out all of their valid permutations. A valid permutation is one where every opening parenthesis ( has its corresponding closing parenthesis ).

    Also, these parentheses can be arranged in any order as long as they are valid. For n = 2, the valid pairs are — (()) and ()(). Also, note n = 2 means two (s and two )s. The maximum number of pairs can be eight.

    Approach
    This problem description and the analysis above scream Recursion and yes it’s the right way to solve this problem. The naive approach is to generate all the permutations. All sequence of length n is ( plus all sequences of length n - 1. The time complexity of this will be O(22n) which is quite large.

    What if we generate only those permutations which we know for sure will be valid? It should reduce the time considerably. We can use backtracking for this purpose. There will be three constraints we need to consider here —

    Base case when number of opening and closing parentheses is equal to n.
    Number of opening parentheses should be less than n.
    A closing parenthesis cannot occur before the open parenthesis.
    To solve this problem, we will follow the below steps -

    Create a list that will store the result.
    Call our backtracking function with empty string and initial number of opening and closing parentheses.
    Check the base case. If number of opening and closing parentheses are equal to n then we will add the string to the list and return.
    If the base case does not meet then we will check if number of opening parentheses is less than n, If true, then we will add ( to the current string and increment the count of opening parenthesis.
    Check if number of closing parentheses is less than open parentheses then we will add ) to the current string and increment the count of closing parentheses.
    Time Complexity
    The time complexity is not easy to understand for this problem. It rests on understanding how many elements are there in the function. This indicates the nth Catalan number which is bounded asymptotically by Cn = 4n/(n\sqrt(n)
    (
    ​
     n)). Since each valid sequence has maximum n steps, therefore, the time complexity will be O(4n/\sqrt(n)
    (
    ​
     n)).

    Space Complexity
    Similar as above logic the total space complexity O(4n/\sqrt(n)
    (
    ​
     n)) for recursive calls and O(n) for storing the sequence.


        */
        public static List<String> generateParenthesis(int n) {
            // Resultant list
            List<String> result = new ArrayList<>();
            /// Recursively generate parentheses
            generateParenthesis(result, "", 0, 0, n);
            return result;
        }
        private static void generateParenthesis(List<String> result, String s, int open, int close, int n) {
            // Base case
            if (open == n && close == n) {
                result.add(s);
                return;
            }
            // If the number of open parentheses is less than the given n
            if (open < n) {
                generateParenthesis(result, s + "(", open + 1, close, n);
            }
            // If we need more close parentheses to balance
            if (close < open) {
                generateParenthesis(result, s + ")", open, close + 1, n);
            }
        }
}
