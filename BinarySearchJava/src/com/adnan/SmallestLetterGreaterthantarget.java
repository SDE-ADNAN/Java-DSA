package com.adnan;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/


public class SmallestLetterGreaterthantarget {
    public static void main(String[] args) {
        char[] letters ={'c','f','j'};
        char target = 'k';
        char ans2 = smallestGreatest(letters,target); // OABS==OrderAgnosticBInarySearch
        System.out.println(ans2);
    }
    // return the index of smallest no >= target
    private static char smallestGreatest(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;
        while(start <=end){
            int mid = start+(end-start)/2;
                if(target < letters[mid]){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
        }
//        here start  is from the time when the while loops gets violated means letters array .length
//         that is start = letters.length(equal to 3)
//        thats why start % letters.length == 0
//               as     3 % 3 ==0
        return letters[start % letters.length];
    }
}
