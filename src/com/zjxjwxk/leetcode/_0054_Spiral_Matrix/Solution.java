package com.zjxjwxk.leetcode._0054_Spiral_Matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * 按层模拟
 * @author Xinkang Wu
 * @date 2021/3/15 10:31
 */
public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        int m = matrix.length, n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < Math.min((m + 1) >> 1, (n + 1) >> 1); ++i) {
            for (int col = i; col < n - i; ++col) {
                ans.add(matrix[i][col]);
            }
            for (int row = i + 1; row < m - i; ++row) {
                ans.add(matrix[row][n - 1 - i]);
            }
            if (i < (m - 1 - i)) {
                for (int col = n - 2 - i; col > i; --col) {
                    ans.add(matrix[m - 1 - i][col]);
                }
            }
            if (i < (n - 1 - i)) {
                for (int row = m - 1 - i; row > i; --row) {
                    ans.add(matrix[row][i]);
                }
            }
        }
        return ans;
    }
}
