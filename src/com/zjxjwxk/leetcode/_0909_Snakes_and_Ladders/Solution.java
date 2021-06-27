package com.zjxjwxk.leetcode._0909_Snakes_and_Ladders;

import java.util.*;

/**
 * 广度优先搜索
 * @author Xinkang Wu
 * @date 2021/6/27 21:08
 */
public class Solution {

    public int snakesAndLadders(int[][] board) {
        int len = board.length;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        Set<Integer> visitedSet = new HashSet<>();
        visitedSet.add(1);
        int step = 0;
        while (!queue.isEmpty()) {
            ++step;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                for (Integer num : getNextLevel(queue.poll(), board)) {
                    if (!visitedSet.contains(num)) {
                        if (num == len * len) {
                            return step;
                        }
                        queue.offer(num);
                        visitedSet.add(num);
                    }
                }
            }
        }
        return -1;
    }

    private List<Integer> getNextLevel(int cur, int[][] board) {
        int len = board.length, max = -1;
        List<Integer> nextLevel = new ArrayList<>(6);
        for (int i = cur + 1; i <= cur + 6 && i <= len * len; ++i) {
            int r = (i - 1) / len, c = (i - 1) % len;
            int row = len - 1 - r;
            int col = (r & 1) == 0 ? c : (len - 1 - c);
            if (board[row][col] != -1) {
                nextLevel.add(board[row][col]);
            } else {
                max = Math.max(max, i);
            }
        }
        if (max != -1) {
            nextLevel.add(max);
        }
        return nextLevel;
    }
}
