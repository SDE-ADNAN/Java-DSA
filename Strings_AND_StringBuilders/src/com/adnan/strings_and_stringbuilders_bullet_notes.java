package com.adnan;

public class strings_and_stringbuilders_bullet_notes {

    public static void main(String[] args) {
	// write your code here
    }
    /*

    1. strings are just like arrays and we can iterate over them like arrays with help of indexing

    2. strings are immutable in java for some of security reasons.
       as if u declare a
       var a ="adnan"
       and then ur accessing it by a different var b
       and if somehow this var a got changed then the value reffered by the var b will also get changed
       (if both var a and b are pointing towards the same string in the heap memory )
       these variables are stored in the stack memory but the string object is stored in the heap memory.

     3. String Pool:-
        string pool in java is like a data structure that stores the value of a string object
        which is referred by many other reference variables . And the most imp part of string
        pool is that it stores only one instance of the recurring string object which in turn
        saves a lot of time space and computational power .
        the strings which are referred  by only one reference variable then it is simply
        stored in the heap it doesn't enter the string pool .
        once the string object is now no more accessed by any variable it is cleared through
        garbage collection.

     4. 
    */


}
