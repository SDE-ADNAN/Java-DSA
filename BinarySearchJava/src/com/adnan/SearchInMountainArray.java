package com.adnan;
/*
here this problem is mainly focussed in finding the peak of the mountain of an array like
arr = {0,1,2,3,4,5,4,3,2,1,0} here peak is 5 as
                 5
               4   4
             3       3
           2           2
         1               1
        0                  0
        // this here above forms a mountain having 5 at its peak
        // here we get to know that the first half is sorted in ascending order
        // whereas the second half is sorted in descending order which makes it easy for us to
        // perform binary search over this array
        // now here we will perform search rather than returning the index of the max element or peak
        // we will find a target here.
        // here we have only done copy and pastefrom our old problems
*/

public class SearchInMountainArray {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/find-in-mountain-array/
    int search(int[] arr, int target) {
        // getting the peak index of the mountain array or bytonic array.
        int peak = peakIndexInMountainArray(arr);

        // here first try means searching in the ascending part
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            // if firstTry is not equal to -1 then simply return the targets index
            return firstTry;
        }
        // or then  try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
