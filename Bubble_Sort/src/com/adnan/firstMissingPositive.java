package com.adnan;

public class firstMissingPositive {
    //leet code 41 find missing positive.
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        System.out.println(Cyclic(arr));
    }

    static int Cyclic(int[] arr){
        // declaring the i pointer(for indexing elements of the array).
        int i = 0;
        while(i<arr.length){
            // this is the correct index at which the item should be present.
            //made change here
            int correct = arr[i]-1;
            // if the element is not present at the correct index then we swap..
            // and made change here also
            // this is running only when the ith item is smaller than the length of the array
            // and also same as that of its index.
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]) {
                swap(arr, i, correct);
            }else{
                // else we change the position of the i pointer to i+1.
                i++;
            }
        }

        // search for the first missing element
        for (int index = 0; index <arr.length;index++){
            // by this we find the first missing number and check this condision.
            if(arr[index]!=index+1){
                return index+1;
            }
        }

        //case 2 where the n+1th element is the smallest missing positive number;
        return arr.length+1;
    }



    // separate function for swapping the elements..
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
