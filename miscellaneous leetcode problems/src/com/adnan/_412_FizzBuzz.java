package com.adnan;

import java.util.ArrayList;
import java.util.List;

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
