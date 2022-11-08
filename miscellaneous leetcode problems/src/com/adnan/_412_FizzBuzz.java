package com.adnan;

import java.util.ArrayList;
import java.util.List;
/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.


Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]


Constraints:

1 <= n <= 104

   */

public class _412_FizzBuzz {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(fizzBuzz(num));
    }
    static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=1; i <=n;i++){
            if(i%3 == 0 && i%5==0)result.add("FizzBuzz");
            else if(i%3 == 0) result.add("Fizz");
            else if(i%5 == 0) result.add("Buzz");
            else  result.add(String.valueOf(i));
//            [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
//            [1, 2,  Buzz, 4, 5,  Buzz, 7, 8,  Buzz, 10, 11,  Buzz, 13, 14, FizzBuzz]

        }
        return result;
    }
}
