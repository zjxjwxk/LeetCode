package com.zjxjwxk.leetcode._0059_Spiral_Matrix_II;

/**
 * 按层模拟
 * @author Xinkang Wu
 * @date 2021/3/16 19:17
 */
public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        for (int i = 0; i < n - i; ++i) {
            for (int j = i; j < n - i; ++j) {
                matrix[i][j] = count++;
            }
            for (int k = i + 1; k < n - i; ++k) {
                matrix[k][n - i - 1] = count++;
            }
            for (int j = n - i - 2; j >= i && n - i - 1 != i; --j) {
                matrix[n - i - 1][j] = count++;
            }
            for (int k = n - i - 2; k >= i + 1 && i != n - i - 1; --k) {
                matrix[k][i] = count++;
            }
        }
        return matrix;
    }
}
