package com.zjxjwxk.leetcode._0994_Rotting_Oranges;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Xinkang Wu
 * @date 2025/7/27 12:38
 */
public class Solution {

    private static final int[][] DIRECTIONS = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length, minutes = 0;
        Queue<int[]> level = new LinkedList<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 2) {
                    level.offer(new int[]{i, j});
                }
            }
        }
        while (!level.isEmpty()) {
            int size = level.size();
            for (int i = 0; i < size; ++i) {
                int[] rotten = level.poll();
                for (int[] direction: DIRECTIONS) {
                    int nextRow = rotten[0] + direction[0], nextCol = rotten[1] + direction[1];
                    if (nextRow >= 0 && nextRow < m && nextCol >= 0 && nextCol < n && grid[nextRow][nextCol] == 1) {
                        level.offer(new int[]{nextRow, nextCol});
                        grid[nextRow][nextCol] = 2;
                    }
                }
            }
            if (!level.isEmpty()) {
                ++minutes;
            }
        }
        for (int[] row : grid) {
            for (int orange : row) {
                if (orange == 1) {
                    return -1;
                }
            }
        }
        return minutes;
    }
}
