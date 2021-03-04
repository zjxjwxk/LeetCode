package com.zjxjwxk.leetcode._0304_Range_Sum_Query_2D_Immutable;

/**
 * 一维前缀和
 * @author Xinkang Wu
 * @date 2021/3/2 22:06
 */
public class NumMatrix {

    private final int[][] sums;

    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            sums = new int[][]{};
            return;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        sums = new int[row][col + 1];
        for (int i = 0; i < row; ++i) {
            for (int j = 1; j <= col; ++j) {
                sums[i][j] = sums[i][j - 1] + matrix[i][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; ++i) {
            sum += sums[i][col2 + 1] - sums[i][col1];
        }
        return sum;
    }
}
