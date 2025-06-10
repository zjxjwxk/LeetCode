package com.zjxjwxk.leetcode._0048_Rotate_Image;

/**
 * 翻转代替旋转
 *
 * @author Xinkang Wu
 * @date 2025/6/10 21:02
 */
public class Solution2 {

    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int n = matrix.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                swap(matrix, i, j, j, i);
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < (n >> 1); ++j) {
                swap(matrix, i, j, i, n - 1 - j);
            }
        }
    }

    private void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }
}
