package com.adnan;

import java.util.ArrayList;
import java.util.List;

public class _118_Pascals_Triangle {


    /*
    a pascals triangle is
                              1
                            1   1
                          1   2   1
                        1   3   3  1
                      1   4   6   4  1
                    1   5   10  10  5  1



    * */
    public static void main(String[] args) {

    }
    static List<List<Integer>> generate(int numRows) {
        // creating the resultant arraylist.
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // loop till the numRows as list contains numRows amount of rows.
        for(int i = 0; i < numRows; i++)
        {
            // temp list to store an individual row which will at last get added to result list
            List<Integer> temp = new ArrayList<Integer>();
            // looping till the row size as exact that much elements occur in the array
            for(int j = 0; j < i+1 ; j++)
            {
                // all 1st and last indices are 1
                if(j == 0 || j == i)
                {
                    // therefore add 1 at 0 and last element
                    temp.add(1);
                }else
                {
                    // else add upper/previous rows 1st and 2nd indices for this rows 2nd element
                    // and append it to this row.
                    temp.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            // at the end add the temp row to the result list
            result.add(temp);
        }
        return result;
    }
}
