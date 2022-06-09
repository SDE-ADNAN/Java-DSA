package com.adnan;

import java.util.Arrays;

public class methods_of_string_class {

    public static void main(String[] args) {
        String name = "Kunal Kushwaha Hello World";
        // here it is converting it to a character array
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Kunal   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
