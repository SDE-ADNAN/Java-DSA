package com.adnan;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/


public class SmallestLetterGreaterthantarget {
    public static void main(String[] args) {
        char[] letters ={'c','f','j'};
        char target = 'f';
        char ans2 = smallestGreatest(letters,target); // OABS==OrderAgnosticBInarySearch

        System.out.println(ans2);
    }
    // return the index of smallest no >= target
    private static char smallestGreatest(char[] letters, char target) {



        int start = 0;
        int end = letters.length -1;
        boolean IsAsccending = letters[start]<letters[end];

        while(start <=end){
//         find the middle element
//            int mid = (start+end)/2; // this may lead to mid exceeding the max capacity of int and throw error;
            int mid = start+(end-start)/2;

            if(IsAsccending){
                if(target < letters[mid]){
                    end = mid-1;
                }else{
                    start = mid +1;
                }

            }
        }
        return letters[start % letters.length];
    }
}
