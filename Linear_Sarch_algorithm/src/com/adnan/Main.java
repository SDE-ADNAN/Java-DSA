package com.adnan;

public class Main {

    public static void main(String[] args) {
        // linear searching means searching something in a given direction
        // and searching in a collection datastructure like array, or string



        //=======================================================================

       int [] arr = {1,2,3,4,5,6,7,8,9};

//       int ans = linearSearch(arr, 6);
        int ans = linearSearchReturnElement(arr , 10);
        System.out.println(ans);
//        Q: Find whether 4 exists in the arr array??
//        Ans: firstly iterate over the given array and search for the value on each index
//             after that if the value is found then return the index of that value or return -1;;
//         =================================================================================

//        ABOUT : Time Complexity
/*       1. time complexity is calculated by the searching time taken by our algorithm to search any item
//          given in a dataset..
//       2. in the best case we will get our item at the first index which will be completed in minimum time
//          in  this type of case the length of the array does not matters as we are getting our
//          result/target value at the first index/place
//          so the  big 'O' notation for this case will be O(1)
//       3. in the worst case where we iterated through the whole array of thousands items or millions of items
//          but still failed to find the target , here the time is directly proportional to the length of the array
//          for this we get a linear graph where time increases with the increase in size of the array..
//          so big o for this case is O(n) where n is the length of the array..
 */
    }

//   search in the array : return index of item if present
//    otherwise if item not found return -1

    static int linearSearch(int[] arr ,int target){

        // if array is empty
        if(arr.length == 0){
            return -1;
        }

        // for searching
        for (int index = 0; index < arr.length; index++) {
            // check for element at each index if it is == target
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
        return -1;
    }

    static int linearSearchReturnElement(int[] arr ,int target){

        // if array is empty
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        // for searching
        for (int element : arr) {
            // check for element at each index if it is == target
            if (element == target) {
                return element;
            }

        }
        return Integer.MAX_VALUE;
    }


}
