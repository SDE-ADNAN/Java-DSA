package com.adnan;
/*
*   Binary search is done in three steps:
*   1. sort the given array in ascending order
*   2. place two pointers start and index over the zeroth and last item
*   3. then specify the middle number which is start + end divided by 2;
*   4. if the middle number matches then stop search
*   5. if target is not found in 1st attempt reapeat the same process;
*   6. but now after all this the start will be middleNumber + 1(index) and
*   7. end will be same if the target is located to the right
*      if the number is on the left side of the array then start will remain
*      where it is  but now the end will move towards the start
*   8. this results in halving the array with each iterration  and reaching to the
*      target more closer..
* */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
