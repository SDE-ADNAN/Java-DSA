package com.adnan;

import java.util.HashSet;

public class _804_Unique_Morse_Code_Words {
    public static void main(String[] args) {
        // here we need to make morse code for each item and then compare  each morse code
        // and remove the duplicate morse codes and at the end just return no.of unique morse codes.
       String[] words = {"gin","zen","gig","msg"};
        System.out.println(getSetNum(words));
    }
    static int getSetNum(String[] s){
        // creating a string array for each char from a to z of morse code value
        String[] MORSE ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        // creating a hashset which will only store unique values
        HashSet <String> uniqueSet = new HashSet<>();
        //looping through the s => input array of strings
        for (String word: s) {
            // creating a stringBuilder as we need to append char on each iteration
            StringBuilder transformation = new StringBuilder();
            // looping through each word of s by converting it to a char array
            for (char letter: word.toCharArray()) {
                // appending the item from morse string array from the index equal to letter - a
                // which at the end returns the integer value e.g if letter is c then c ka ASCII code == 99
                // and a ka ASCII code == 97 so 99-97 == 2 and then it will pick the MORSE[2] which is the third
                // item and will append it to the transformation string
                 transformation.append(MORSE[letter-'a']);
            }
            // adding the transformation to the uniqueSet along with calling the .toString()
            uniqueSet.add(transformation.toString());
        }
        // returning the size ot the hashset.
        return uniqueSet.size();
    }
}
