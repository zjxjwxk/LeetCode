package com.zjxjwxk.leetcode._1034_Coloring_A_Border;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 广度优先搜索
 * @author Xinkang Wu
 * @date 2021/12/7 17:24
 */
public class Solution {

    private static final int[][] DIR = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int m = grid.length, n = grid[0].length, oldColor = grid[row][col];
        if (oldColor == color) {
            return grid;
        }
        boolean[][] vis = new boolean[m][n];
        List<int[]> borderList = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});
        vis[row][col] = true;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1];
            boolean border = false;
            for (int i = 0; i < 4; ++i) {
                int nextX = x + DIR[i][0];
                int nextY = y + DIR[i][1];
                if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && grid[nextX][nextY] == oldColor) {
                    if (!vis[nextX][nextY]) {
                        queue.offer(new int[]{nextX, nextY});
                        vis[nextX][nextY] = true;
                    }
                } else {
                    border = true;
                }
            }
            if (border) {
                borderList.add(cur);
            }
        }
        for (int[] border : borderList) {
            grid[border[0]][border[1]] = color;
        }
        return grid;
    }
}
