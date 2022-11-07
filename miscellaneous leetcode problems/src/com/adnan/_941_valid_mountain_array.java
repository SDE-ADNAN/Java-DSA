package com.adnan;

public class _941_valid_mountain_array {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,3,6,8,9,7,6,5,4,3,2};
        System.out.println(validMountainArray(nums));
    }
    public static boolean validMountainArray(int[] A) {
        int i = 0;
        while(i < A.length && i + 1 < A.length && A[i] < A[i + 1]){
            i++;// incrementing only when i < than the length of whole array length
            // and also item next to it towards the length  must be  < than the length of whole array length
            // also A[i] < A[i+1]
        }

        if(i == 0 || i + 1 >= A.length){
            return false;// edge case as , if i==0 after traversing the array it means the array is empty
            // or i+1 >= A.length then also we will return false
        }
        while(i < A.length && i + 1 < A.length){
            // this while loop is for checking any presence of a plateau

            // here A[i++ +1] is equal to A[++i]

//             if(A[i] <= A[++i]){
            if(A[i] <= A[i++ +1]){
                System.out.println("plateau");
                return false;
            }
        }
        return true;
    }
}
