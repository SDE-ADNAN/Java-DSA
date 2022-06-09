package com.adnan;

import java.util.Arrays;

public class methods_of_string_class {

    public static void main(String[] args) {
        String name = "Kunal Kushwaha Hello World";
        // here it is converting it to a character array
        System.out.println(Arrays.toString(name.toCharArray()));
        // all the characters of the name str will be made uppercase chars
        System.out.println(name.toLowerCase());
        System.out.println(name);
        // will give the index on which char a occured for first time
        System.out.println(name.indexOf('a'));
        // will strip the white spaces from the string
        System.out.println("     Kunal   ".strip());
        // will split the str into array elements disconnected from the place where a space was present
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
