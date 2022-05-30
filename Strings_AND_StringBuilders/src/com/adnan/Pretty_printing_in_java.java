package com.adnan;

public class Pretty_printing_in_java {
    public static void main(String[] args) {
        float a = 453.136f;
//        System.out.printf("Formatted number 'string' : %.2f",a);
        // here we are using the printf method of out which is used for formatting strings and numbers
        // it also rounds off the result variable value.


//        System.out.println(Math.PI); // this gives  --> 3.141592653589793

//        System.out.printf("PI : %.2f",Math.PI); // this gives --> PI : 3.14


        System.out.printf("hey my name is %s and i am a %s","adnan","youtuber");



        /*

        Format specifiers:-
Format Specifier	            Data Type	                                                           Output
         %a	           floating point (except BigDecimal)	                            Returns Hex output of floating point number.
         %b	            Any type	                                                    "true" if non-null, "false" if null
         %c	            character	                                                    Unicode character
         %d	            integer (incl. byte, short, int, long, bigint)	                Decimal Integer
         %e	             floating point	                                                decimal number in scientific notation
         %f	             floating point	                                                decimal number
         %g	            floating point	                                                decimal number, possibly in scientific notation depending on the precision and value.
         %h	             any type	                                                    Hex String of value from hashCode() method.
         %n	            none	                                                        Platform-specific line separator.
         %o	            integer (incl. byte, short, int, long, bigint)	                Octal number
         %s	            any type	                                                    String value
         %t	             Date/Time (incl. long, Calendar, Date and TemporalAccessor)	%t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
         %x	              integer (incl. byte, short, int, long, bigint)                Hex string.
          */
    }
}
