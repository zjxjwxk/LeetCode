package com.zjxjwxk.leetcode._0212_Word_Search_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/9/16 14:33
 */
public class Solution {

    private static final int[][] DIRECTION = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public List<String> findWords(char[][] board, String[] words) {
        int m = board.length, n = board[0].length;
        List<int[]>[] chRoots = new ArrayList[26];
        for (int i = 0; i < 26; ++i) {
            chRoots[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                chRoots[board[i][j] - 'a'].add(new int[]{i, j});
            }
        }
        List<String> ans = new ArrayList<>();
        boolean[][] vis = new boolean[m][n];
        for (String word : words) {
            for (int[] root : chRoots[word.charAt(0) - 'a']) {
                for (int i = 0; i < m; ++i) {
                    Arrays.fill(vis[i], false);
                }
                if (dfs(board, vis, root[0], root[1], word, 0)) {
                    ans.add(word);
                    break;
                }
            }
        }
        return ans;
    }

    private boolean dfs(char[][] board, boolean[][] vis, int x, int y, String word, int index) {
        if (index == word.length() - 1) {
            return board[x][y] == word.charAt(index);
        }
        if (board[x][y] != word.charAt(index)) {
            return false;
        }
        vis[x][y] = true;
        int m = board.length, n = board[0].length;
        for (int[] dir : DIRECTION) {
            int nextX = x + dir[0], nextY = y + dir[1];
            if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n
                    && !vis[nextX][nextY] && dfs(board, vis, nextX, nextY, word, index + 1)) {
                return true;
            }
        }
        vis[x][y] = false;
        return false;
    }
}
