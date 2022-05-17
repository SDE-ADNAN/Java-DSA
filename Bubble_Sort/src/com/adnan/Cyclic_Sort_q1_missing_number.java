package com.adnan;

public class Cyclic_Sort_q1_missing_number {
    //leetcode #268
    // this algo is only for arrays with 0,n range 
    public static void main(String[] args) {
     int[] arr = { 4,0,1,2};
        System.out.println(Cyclic(arr));
    }
    static int Cyclic(int[] arr){
        // declaring the i pointer(for indexing elements of the array).
        int i = 0;
        while(i<arr.length){
            // this is the correct index at which the item should be present.
            //made change here
            int correct = arr[i];
            // if the element is not present at the correct index then we swap..
            // and made change here also
            // this is running only when the ith item is smaller than the length of the array
            // and also same as that of its index.
            if(arr[i]<arr.length && arr[i]!=arr[correct]) {
                swap(arr, i, correct);
            }else{
                // else we change the position of the i pointer to i+1.
                i++;
            }
        }

        // search for the first missing element
        for (int index = 0; index <arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }

        //case 2 where the nth element is missing then;
        return arr.length;
    }


    // separate function for swapping the elements..
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
