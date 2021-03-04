package com.zjxjwxk.leetcode._0304_Range_Sum_Query_2D_Immutable;

/**
 * 二维前缀和
 * @author Xinkang Wu
 * @date 2021/3/2 22:06
 */
public class NumMatrix2 {

    private final int[][] sums;

    public NumMatrix2(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            sums = new int[][]{};
            return;
        }
        int row = matrix.length, col = matrix[0].length;
        sums = new int[row + 1][col + 1];
        for (int i = 1; i <= row; ++i) {
            for (int j = 1; j <= col; ++j) {
                sums[i][j] = matrix[i - 1][j - 1] + sums[i][j - 1] + sums[i - 1][j] - sums[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sums[row2 + 1][col2 + 1] - sums[row2 + 1][col1] - sums[row1][col2 + 1] + sums[row1][col1];
    }
}
