package com.zjxjwxk.leetcode._0427_Construct_Quad_Tree;

/**
 * DFS
 * 时间复杂度：O(n^2 logn)
 * 空间负责度：O(logn)
 *
 * @author Xinkang Wu
 * @date 2026/2/24 13:58
 */
public class Solution {

    public Node construct(int[][] grid) {
        int n = grid.length;
        return dfs(grid, 0, n - 1, 0, n - 1);
    }

    private Node dfs(int[][] grid, int row1, int row2, int col1, int col2) {
        if (row1 == row2) {
            return new Node(grid[row1][col1] == 1, true);
        }
        int num = grid[row1][col1];
        for (int i = row1; i <= row2; ++i) {
            for (int j = col1; j <= col2; ++j) {
                if (grid[i][j] != num) {
                    int len = row2 - row1 + 1;
                    return new Node(true, false,
                            dfs(grid, row1, row1 + (len >> 1) - 1, col1, col1 + (len >> 1) - 1),
                            dfs(grid, row1, row1 + (len >> 1) - 1, col1 + (len >> 1), col2),
                            dfs(grid, row1 + (len >> 1), row2, col1, col1 + (len >> 1) - 1),
                            dfs(grid, row1 + (len >> 1), row2, col1 + (len >> 1), col2)
                    );
                }
            }
        }
        return new Node(grid[row1][col1] == 1, true);
    }
}
