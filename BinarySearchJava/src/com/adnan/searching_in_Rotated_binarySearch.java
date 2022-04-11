package com.adnan;

public class searching_in_Rotated_binarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};

        System.out.println(findPivot(arr));
    }

    static int search(int[] arr ,int target){
        int pivot = findPivot(arr);

//        if the pivot does not exists then the array is not rotated
        //so
        if(pivot == -1){
            // just do normal binary search
            return BinarySearch(arr,target,0,arr.length-1);
        }
//        if pivot is found that means u have found 2 asccending arrays
        if(pivot == target){
            return pivot;
        }

        

    }


    static int BinarySearch(int[] arr ,int  target,int start , int end){
        while(start <=end){
//         find the middle element
//            int mid = (start+end)/2; // this may lead to mid exceeding the max capacity of int and throw error;
            int mid = start+(end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
//                     ans found
                return mid;
            }
        }
        return -1;
    }


    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            // 4 cases over here

            //case no.1
            // here we are checking that if mid-item is bigger than the mid+1 item then return it
            // as it is the required pivot i.e. the ans that we are searching for
            // also we are checking to apply this condition only when the mid element is smaller than the end item
            // of the array as at some point our mid may be equal to the end so in that case this check
            // will result in the "index out of bound error " as the search will go ahead of end ..
            if (mid<end && arr[mid] > arr[mid+1]){
                return arr[mid];  // for returning the value of pivot
//                return mid;   -------for returning index of pivot
            }

            // case no.2
            // here we are checking that if mid-item is smaller than the mid-1 item then return mid-1 item
            // as it is the required pivot i.e. the ans that we are searching for
            // also we are checking to apply this condition only when the mid-element is bigger than the start item
            if(mid>start && arr[mid] < arr[mid-1]){
                return arr[mid-1];   // for returning the value of pivot
//                return mid-1;      -------for returning index of pivot
            }

            // case no.3 and case no.4
            // here we are checking that if our mid-element is smaller than or equal to the start of array
            // then we will skip the portion of array that lies after the mid (containing mid) and
            // hence our end will be now mid-1 to search in the halved array
            // in the else case we are doing reciprocal of that so if the mid-element is smaller than the start element
            // then we will skip the portion of the array that lies before the mid (containing mid) and
            // hence our start will be mid+1 to search further.
            if(arr[mid]<=arr[start]){
                end = mid -1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }
}
