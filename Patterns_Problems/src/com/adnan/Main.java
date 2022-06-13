package com.adnan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        pattern1(4);
    }

    static void pattern1(int n){
        for (int row = 1; row <=n; row++) {
            // for every row run the col.
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
//            when one line is printed then we give a newline.
            System.out.println();
        }
    }
}
