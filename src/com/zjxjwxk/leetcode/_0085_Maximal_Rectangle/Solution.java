package com.zjxjwxk.leetcode._0085_Maximal_Rectangle;

/**
 * 优化暴力
 * @author Xinkang Wu
 * @date 2020/12/26 19:34
 */
public class Solution {

    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int row = matrix.length, col = matrix[0].length, ans = 0;
        int[][] left = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (matrix[i][j] == '1') {
                    if (j == 0) {
                        left[i][j] = 1;
                    } else {
                        left[i][j] = left[i][j - 1] + 1;
                    }
                }
            }
        }
        for (int j = 0; j < col; ++j) {
            for (int i = 0; i < row; ++i) {
                int width = left[i][j], downIndex = i, upIndex = i;
                while (downIndex + 1 < row && width <= left[downIndex + 1][j]) {
                    ++downIndex;
                }
                while (upIndex - 1 >= 0 && width <= left[upIndex - 1][j]) {
                    --upIndex;
                }
                ans = Math.max(ans, width * (downIndex - upIndex + 1));
            }
        }
        return ans;
    }
}
