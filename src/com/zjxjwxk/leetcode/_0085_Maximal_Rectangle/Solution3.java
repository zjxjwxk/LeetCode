package com.zjxjwxk.leetcode._0085_Maximal_Rectangle;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 单调栈+常数优化
 * @author Xinkang Wu
 * @date 2020/12/26 19:34
 */
public class Solution3 {

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
            int[] up = new int[row];
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i = 0; i < row; ++i) {
                while (!stack.isEmpty() && left[i][j] <= left[stack.peek()][j]) {
                    int popIndex = stack.pop();
                    ans = Math.max(ans, left[popIndex][j] * (i - up[popIndex] - 1));
                }
                if (stack.isEmpty()) {
                    up[i] = -1;
                } else {
                    up[i] = stack.peek();
                }
                stack.push(i);
            }
            while (!stack.isEmpty()) {
                int popIndex = stack.pop();
                ans = Math.max(ans, left[popIndex][j] * (row - up[popIndex] - 1));
            }
        }
        return ans;
    }
}
