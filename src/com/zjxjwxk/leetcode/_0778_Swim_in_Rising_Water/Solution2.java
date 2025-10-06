package com.zjxjwxk.leetcode._0778_Swim_in_Rising_Water;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * BFS+最小堆
 *
 * @author Xinkang Wu
 * @date 2025/10/6 15:34
 */
public class Solution2 {

    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, -1}, {0, 1}
    };

    public int swimInWater(int[][] grid) {
        int m = grid.length, n = grid[0].length, maxHeight = 0;
        Queue<int[]> minHeap = new PriorityQueue<>((arr1, arr2) -> arr1[0] - arr2[0]);
        boolean[][] vis = new boolean[m][n];
        minHeap.offer(new int[]{grid[0][0], 0, 0});
        while (!minHeap.isEmpty()) {
            int[] min = minHeap.poll();
            int height = min[0], i = min[1], j = min[2];
            vis[i][j] = true;
            maxHeight = Math.max(maxHeight, height);
            if (i == m - 1 && j == n - 1) {
                return maxHeight;
            }
            for (int[] direction : DIRECTIONS) {
                int nextI = i + direction[0], nextJ = j + direction[1];
                if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n && !vis[nextI][nextJ]) {
                    minHeap.offer(new int[]{grid[nextI][nextJ], nextI, nextJ});
                }
            }
        }
        return maxHeight;
    }
}
