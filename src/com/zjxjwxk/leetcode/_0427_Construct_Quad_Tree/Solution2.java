package com.zjxjwxk.leetcode._0427_Construct_Quad_Tree;

/**
 * DFS+前缀和
 * 时间复杂度：O(n^2)
 * 空间负责度：O(n^2)
 *
 * @author Xinkang Wu
 * @date 2026/2/24 13:58
 */
public class Solution2 {

    public Node construct(int[][] grid) {
        int n = grid.length;
        int[][] preSum = new int[n + 1][n + 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                preSum[i][j] = grid[i - 1][j - 1] + preSum[i - 1][j] + preSum[i][j - 1] - preSum[i - 1][j - 1];
            }
        }
        return dfs(grid, preSum, 0, n - 1, 0, n - 1);
    }

    private Node dfs(int[][] grid, int[][] preSum, int row1, int row2, int col1, int col2) {
        int sum = getSum(preSum, row1, row2, col1, col2);
        int len = row2 - row1 + 1;
        if (sum == 0 || sum == len * len) {
            return new Node(grid[row1][col1] == 1, true);
        }
        int offset = (row2 - row1) >> 1;
        return new Node(true, false,
                dfs(grid, preSum, row1, row1 + offset, col1, col1 + offset),
                dfs(grid, preSum, row1, row1 + offset, col2 - offset, col2),
                dfs(grid, preSum, row2 - offset, row2, col1, col1 + offset),
                dfs(grid, preSum, row2 - offset, row2, col2 - offset, col2)
        );
    }

    private int getSum(int[][] preSum, int row1, int row2, int col1, int col2) {
        return preSum[row2 + 1][col2 + 1] - preSum[row1][col2 + 1] - preSum[row2 + 1][col1] + preSum[row1][col1];
    }
}
