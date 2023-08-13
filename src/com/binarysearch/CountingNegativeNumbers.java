package com.binarysearch;

/*Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, 
 * return the number of negative numbers in grid.
Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0*/

public class CountingNegativeNumbers {
    public static int countNegatives(int[][] grid) {
        int count = 0;

        for (int[] row : grid) {
            int left = 0;
            int right = row.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (row[mid] < 0) {
                    left = mid + 1;
                } else {
                    right = mid + 1;
                }
            }

            count += row.length - left; 
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {-4, -3, -2, -1},
            {-3, -2, -1,  0},
            {-1,  0,  1,  2},
            { 0,  1,  3,  4}
        };

        System.out.println(countNegatives(grid)); 
    }
}

