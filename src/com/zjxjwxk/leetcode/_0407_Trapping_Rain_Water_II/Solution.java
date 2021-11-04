package com.zjxjwxk.leetcode._0407_Trapping_Rain_Water_II;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 最小堆
 * @author Xinkang Wu
 * @date 2021/11/4 13:16
 */
public class Solution {

    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length, n = heightMap[0].length, ans = 0;
        if (m <= 2 || n <= 2) {
            return 0;
        }
        boolean[][] vis = new boolean[m][n];
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    minHeap.offer(new int[]{i, j, heightMap[i][j]});
                    vis[i][j] = true;
                }
            }
        }
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!minHeap.isEmpty()) {
            int[] cur = minHeap.poll();
            for (int[] direction : directions) {
                int x = cur[0] + direction[0];
                int y = cur[1] + direction[1];
                if (x >= 0 && x < m && y >= 0 && y < n && !vis[x][y]) {
                    if (heightMap[x][y] < cur[2]) {
                        ans += cur[2] - heightMap[x][y];
                    }
                    minHeap.offer(new int[]{x, y, Math.max(heightMap[x][y], cur[2])});
                    vis[x][y] = true;
                }
            }
        }
        return ans;
    }
}
