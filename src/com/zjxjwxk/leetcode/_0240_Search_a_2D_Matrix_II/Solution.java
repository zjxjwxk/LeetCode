package com.zjxjwxk.leetcode._0240_Search_a_2D_Matrix_II;

/**
 * @author zjxjwxk
 * @date 2020/7/26 11:32 下午
 */
public class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int i = 0, j = matrix[0].length - 1;
        while (i <= matrix.length - 1 && j >= 0) {
            if (target == matrix[i][j]) {
                return true;
            } else if (target < matrix[i][j]) {
                --j;
            } else {
                ++i;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(searchMatrix(arr, 20));
    }
}
