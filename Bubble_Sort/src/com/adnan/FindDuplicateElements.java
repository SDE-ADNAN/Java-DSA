package com.adnan;

public class FindDuplicateElements {
    // leetcode #287 find duplicate numbers
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = Cyclic(arr);
        System.out.println(ans);
    }
    static int Cyclic(int[] arr){
        // declaring the i pointer(for indexing elements of the array).
        int i = 0;
        while(i<arr.length){
            // this is the correct index at which the item should be present.
            if(arr[i] != i+1){
                int correct = arr[i]-1;
                // if the element is not present at the correct index then we swap..
                if(arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                }else{
                    // if arr[i] == arr[correct] then return the number
                    return arr[i];
                }
            }else{
                // else we change the position of the i pointer to i+1..
                i++;
            }

        }
        return -1;

    }
    // separate function for swapping the elements..
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
