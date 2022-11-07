package com.adnan;

import java.util.Arrays;
import java.util.LinkedList;

public class _56_Merge_Intervals {
    public static void main(String[] args) {

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        int[][] result= mergeIntervals(intervals);

        print2D(result);
    }

    private static int[][] mergeIntervals(  int[][] intervals) {
        // sorting the intervals array by comparing first element of the pair
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // using linked ist  as insertion and deletion are fast
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++)

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++){
                if(j == 0){
                    System.out.print("[");
                }
                System.out.print(mat[i][j] );
                if(j != mat[i].length - 1){
                    System.out.print(",");
                }
                if(j == mat[i].length - 1){
                    System.out.print("]");
                }}
    }
}
