package com.zjxjwxk.leetcode._0773_Sliding_Puzzle;

import java.util.*;

/**
 * 广度优先搜索
 * @author Xinkang Wu
 * @date 2021/6/26 23:21
 */
public class Solution {

    private static final int[][] MOVE = {{1, 3}, {0, 2, 4}, {1, 5}, {0, 4}, {1, 3, 5}, {2, 4}};

    public int slidingPuzzle(int[][] board) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                sb.append(board[i][j]);
            }
        }
        String initial = sb.toString();
        if ("123450".equals(initial)) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(initial);
        Set<String> visitedSet = new HashSet<>();
        visitedSet.add(initial);
        int step = 0;
        while (!queue.isEmpty()) {
            ++step;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                for (String nextStr : getNextLevel(queue.poll())) {
                    if (!visitedSet.contains(nextStr)) {
                        if ("123450".equals(nextStr)) {
                            return step;
                        }
                        queue.offer(nextStr);
                        visitedSet.add(nextStr);
                    }
                }
            }
        }
        return -1;
    }

    private List<String> getNextLevel(String cur) {
        List<String> nextLevel = new ArrayList<>(3);
        char[] curChArr = cur.toCharArray();
        int zeroIndex = cur.indexOf('0');
        for (int moveIndex : MOVE[zeroIndex]) {
            swap(curChArr, zeroIndex, moveIndex);
            nextLevel.add(new String(curChArr));
            swap(curChArr, zeroIndex, moveIndex);
        }
        return nextLevel;
    }

    private void swap(char[] chArr, int index1, int index2) {
        char temp = chArr[index1];
        chArr[index1] = chArr[index2];
        chArr[index2] = temp;
    }
}
