package com.zjxjwxk.leetcode._0048_Rotate_Image;

/**
 * 原地旋转
 * @author Xinkang Wu
 * @date 2020/12/20 18:54
 */
public class Solution {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n >> 1); ++i) {
            for (int j = i; j < n - i - 1; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }
}
