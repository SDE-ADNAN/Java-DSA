package com.adnan;

public class StringBuilder_Class {

    /*
    here we are using the string builder class to perform the append method
    with help of a for loop which rather that creating a new object in the heap
    like the string class , the string builder class performs all the operation on the same
    stringbuilder object which is beneficial for saving memory space and time required.



        */
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        builder.reverse();

        System.out.println(builder);
    }
}
