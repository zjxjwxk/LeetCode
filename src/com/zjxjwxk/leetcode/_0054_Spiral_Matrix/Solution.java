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
        int m = matrix.length, n = matrix[0].length, total = m * n;
        List<Integer> ans = new ArrayList<>(total);
        for (int i = 0; i < m - i; ++i) {
            for (int j = i; j < n - i; ++j) {
                ans.add(matrix[i][j]);
            }
            for (int k = i + 1; k < m - i; ++k) {
                ans.add(matrix[k][n - i - 1]);
            }
            for (int j = n - i - 2; j >= i && m - i - 1 != i; --j) {
                ans.add(matrix[m - i - 1][j]);
            }
            for (int k = m - i - 2; k >= i + 1 && i != n - i - 1; --k) {
                ans.add(matrix[k][i]);
            }
            if (ans.size() == total) {
                return ans;
            }
        }
        return ans;
    }
}
