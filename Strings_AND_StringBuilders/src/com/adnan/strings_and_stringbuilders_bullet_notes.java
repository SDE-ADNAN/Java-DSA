package com.adnan;

public class strings_and_stringbuilders_bullet_notes {

    public static void main(String[] args) {
        String A = new String("adnan");

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

     4. How to create different string objects of same value ?
  Ans:- we will use the new keyword for creating a new String of same type
        eg.
        String a = new String("adnan");
        String b = new String("adnan");
        this will not create the adnan string object in the string pool and access it for both a and b
        but it will create it normally in the heap memory.

     5. When u only need to check/compare the value of to Strings u must use the .equals() method of the
        java String class.

     6. for accessing the characters of a string we must not use the string[0] technique but instead
        we should use the method defined in the String class called string.charAt(number) this takes
        the index and returns the character at that index.





///////////////////////////////////////////////////////////////////////////////////
Since, Java String is immutable and final, so a new String is created whenever we
do String manipulation. As String manipulations are resource consuming,
Java provides two utility classes: StringBuffer and StringBuilder.
Let us understand the difference between these two utility classes:

1. StringBuffer and StringBuilder are mutable classes. StringBuffer operations are
   thread-safe and synchronized whereas StringBuilder operations are not thread-safe.
2. StringBuffer is to be used when multiple threads are working on same String and
   StringBuilder in the single threaded environment.
3. StringBuilder performance is faster when compared to StringBuffer because of no
   overhead of synchronized.
///////////////////////////////////////////////////////////////////////////////////
    */


}
