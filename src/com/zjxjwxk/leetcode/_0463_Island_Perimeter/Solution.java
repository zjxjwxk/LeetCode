package com.zjxjwxk.leetcode._0463_Island_Perimeter;

/**
 * DFS
 * @author Xinkang Wu
 * @date 2020/10/30 10:35 上午
 */
public class Solution {

    private int[][] graph;
    private int row, col;
    private final int[][] step = {
            {1, 0},
            {0, -1},
            {0, 1},
            {-1, 0}
    };

    public int islandPerimeter(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        graph = grid;
        int i, j;
        for (i = 0; i < row; ++i) {
            for (j = 0; j < col; ++j) {
                if (grid[i][j] == 1) {
                    return dfs(i, j);
                }
            }
        }
        return 0;
    }

    private int dfs(int i, int j) {
        int count = 4;
        graph[i][j] = 2;
        for (int k = 0; k < 4; ++k) {
            int nextRow = i + step[k][0], nextCol = j + step[k][1];
            if (nextRow >= 0 && nextRow < row && nextCol >= 0 && nextCol < col && (graph[nextRow][nextCol] == 1 || graph[nextRow][nextCol] == 2)) {
                --count;
                if (graph[nextRow][nextCol] != 2) {
                    count += dfs(nextRow, nextCol);
                }
            }
        }
        return count;
    }
}
