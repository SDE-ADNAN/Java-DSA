package com.adnan;

public class String_performance {



    /*
    here we are trying to figure it out the laggy performance of the string objects

    as each time when the for loop runs for each iteration a new string object is made in the heap memory

    which causes more and more usage of memory which atlast is of no use
    as strings in java are immutable this is the reason why a new string object is made
    after each iteration and adds the new character at last..

        */
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
    }
}
