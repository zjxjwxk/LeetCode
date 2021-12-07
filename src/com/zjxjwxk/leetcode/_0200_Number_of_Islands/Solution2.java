package com.zjxjwxk.leetcode._0200_Number_of_Islands;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度优先搜索
 * @author Xinkang Wu
 * @date 2021/12/7 20:10
 */
public class Solution2 {

    private static final int[][] DIR = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length, count = 0;
        boolean[][] vis = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    ++count;
                    queue.offer(new int[]{i, j});
                    vis[i][j] = true;
                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        int x = cur[0], y = cur[1];
                        for (int k = 0; k < 4; ++k) {
                            int nextX = x + DIR[k][0];
                            int nextY = y + DIR[k][1];
                            if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && !vis[nextX][nextY] && grid[nextX][nextY] == '1') {
                                queue.offer(new int[]{nextX, nextY});
                                vis[nextX][nextY] = true;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
