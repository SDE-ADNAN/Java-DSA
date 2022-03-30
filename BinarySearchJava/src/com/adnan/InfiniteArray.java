package com.adnan;
/*

this problem is to search the start and end indices of a given infinite array
which means we dont know thw length of the array
we cannot use arr.length method to get the length of the array easily
here we will use binary search
the basic algorithm will be same perhaps we would do it in reverse
means that in binary search we divide the array in half with each iteration
but here we will do BS(binary Search) on the first two indices i.e 0 and 1 and then
multiply the range of search by 2 like 2>4>8>16>32>64>128>256>512(will not search on previously completed indices)
and we will find the length


 */
public class InfiniteArray {
    public static void main(String[] args) {

        // start with box of size 2

        int[] arr ={3,5,7,9,10,90,100,130,140,160,170};

        int target = 10;

        //this will give the index of the target in infinite array without using arr.length method ..
        System.out.println(ans(arr,target));



    }

    static int ans(int[] arr, int target){
        //first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;


        //condition for target to lie in the range
        // if target is bigger than end pointer then we will double the size of box(range)
        // and will apply binary search in that box(range)

        while(target>arr[end]){
            int temp = end+1; // this is the newStart
            // double the box value
            // end = previous end + sizeOfBox*2
            end = end + (end-start+1)*2;
            start = temp;
        }
        return BinarySearch(arr,target,start,end);


    }

    static int BinarySearch(int[] arr ,int  target,int start ,int end) {
//        int start = 0;               -----not defining what should be start and end
//        int end = arr.length - 1;    -----rather than that will use params..
        while (start <= end) {
//         find the middle element
//            int mid = (start+end)/2; // this may lead to mid exceeding the max capacity of int and throw error;
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
//                     ans found
                return mid;
            }
        }
        return -1;
    }
}
