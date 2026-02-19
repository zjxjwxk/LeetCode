package com.zjxjwxk.leetcode._0909_Snakes_and_Ladders;

import java.util.*;

/**
 * 广度优先搜索（剪枝）
 * @author Xinkang Wu
 * @date 2021/6/27 21:08
 */
public class Solution {

    public int snakesAndLadders(int[][] board) {
        int n = board.length, count = 0;
        boolean[] vis = new boolean[n * n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ++count;
            for (int i = 0; i < size; ++i) {
                int id = queue.poll();
                int maxNormalNextId = -1;
                for (int step = 1; step <= 6; ++step) {
                    int nextId = id + step;
                    if (nextId > n * n) {
                        break;
                    }
                    int[] pos = getPosition(nextId, n);
                    int row = pos[0], col = pos[1];
                    if (board[row][col] != -1) {
                        nextId = board[row][col];
                    }
                    if (nextId == n * n) {
                        return count;
                    }
                    if (!vis[nextId]) {
                        vis[nextId] = true;
                        if (board[row][col] != -1) {
                            queue.offer(nextId);
                        } else {
                            maxNormalNextId = Math.max(maxNormalNextId, nextId);
                        }
                    }
                }
                if (maxNormalNextId != -1) {
                    queue.offer(maxNormalNextId);
                }
            }
        }
        return -1;
    }

    private int[] getPosition(int id, int n) {
        int row = (id - 1) / n, col = (id - 1) % n;
        if ((row & 1) == 1) {
            col = n - 1 - col;
        }
        return new int[]{n - 1 - row, col};
    }
}
