package com.adnan;

import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+0); //value of 'a' = 97(ascii value)
        System.out.println('b'+0); // value of 'b' = 98(ascii value)
        System.out.println('a'+'b'); // gives 195(ascii value) in output
        System.out.println((char)('a'+3)); // gives d(103) in output
        System.out.println("a" + "b"); // gives "ab" in output which is a string
        System.out.println('a'+3);// gives 100 in output .


        System.out.println('a'+1);
        // this is same as after few steps :'a' + 1
        // integer will be converted to Integer which will further call the toString() method:

        // if we con cat any class  object to a string it will be first converted to string
        // by calling the toString() method on it .
        System.out.println("adnan" + new ArrayList<>());// output : adnan[]
        System.out.println("adnan" + new Integer(56));// output : adnan56


        // + operator only concatinates and returns string only when  either one of
        // the operands is a string  to be concatinated.
       // System.out.println(new Integer(56) + new ArrayList<>()); // this will not work.
        System.out.println(new Integer(56) +""+ new ArrayList<>()); // this will work fine



    }
}
