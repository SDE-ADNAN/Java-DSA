package com.adnan;

public class _378_Kth_Smallest_Element_in_a_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;

        System.out.println(kthSmallest(matrix,k));
    }
    public static int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = matrix[0][0];
        int end = matrix[m - 1][n - 1];

        while (start < end) {
            int mid = (end - start) / 2 + start;
            int count = 0;
            int j = n - 1;

            for (int i = 0; i < m; i++) {
                while (j >= 0 && matrix[i][j] > mid)
                    j--;
                count += j + 1;
            }

            if (count < k)
                start = mid + 1;
            else
                end = mid;
        }
        return start;

    }
}
