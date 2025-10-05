package com.zjxjwxk.leetcode._0417_Pacific_Atlantic_Water_Flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DFS（从边缘开始）
 *
 * @author Xinkang Wu
 * @date 2025/10/5 15:22
 */
public class Solution {

    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, -1}, {0, 1}
    };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        for (int r = 0; r < m; ++r) {
            for (int c = 0; c < n; ++c) {
                if (r == 0 || c == 0) {
                    dfs(heights, r, c, pacific);
                }
                if (r == m - 1 || c == n - 1) {
                    dfs(heights, r, c, atlantic);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int r = 0; r < m; ++r) {
            for (int c = 0; c < n; ++c) {
                if (pacific[r][c] && atlantic[r][c]) {
                    ans.add(Arrays.asList(r, c));
                }
            }
        }
        return ans;
    }

    private void dfs(int[][] heights, int r, int c, boolean[][] ocean) {
        if (ocean[r][c]) {
            return;
        }
        ocean[r][c] = true;
        for (int[] direction : DIRECTIONS) {
            int nextR = r + direction[0], nextC = c + direction[1];
            if (nextR >= 0 && nextR < heights.length && nextC >= 0 && nextC < heights[0].length && heights[nextR][nextC] >= heights[r][c]) {
                dfs(heights, nextR, nextC, ocean);
            }
        }
    }
}
