package com.zjxjwxk.leetcode._0130_Surrounded_Regions;

/**
 * DFS
 *
 * @author Xinkang Wu
 * @date 2026/2/16 15:07
 */
public class Solution {

    private static final int[][] DIRECTIONS = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            visNotSurrounded(board, vis, i, 0);
            visNotSurrounded(board, vis, i, n - 1);
        }
        for (int j = 1; j < n - 1; j++) {
            visNotSurrounded(board, vis, 0, j);
            visNotSurrounded(board, vis, m - 1, j);
        }
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (!vis[i][j] && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void visNotSurrounded(char[][] board, boolean[][] vis, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || vis[i][j] || board[i][j] != 'O') {
            return;
        }
        vis[i][j] = true;
        for (int[] direction : DIRECTIONS) {
            int nextI = i + direction[0];
            int nextJ = j + direction[1];
            visNotSurrounded(board, vis, nextI, nextJ);
        }
    }
}
