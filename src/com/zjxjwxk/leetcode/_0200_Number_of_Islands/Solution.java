package com.zjxjwxk.leetcode._0200_Number_of_Islands;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/12/7 20:10
 */
public class Solution {

    private static final int[][] DIR = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length, count = 0;
        boolean[][] vis = new boolean[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    ++count;
                    dfs(grid, i, j, vis);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int x, int y, boolean[][] vis) {
        int m = grid.length, n = grid[0].length;
        vis[x][y] = true;
        for (int i = 0; i < 4; ++i) {
            int nextX = x + DIR[i][0];
            int nextY = y + DIR[i][1];
            if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && grid[nextX][nextY] == '1' && !vis[nextX][nextY]) {
                dfs(grid, nextX, nextY, vis);
            }
        }
    }
}
