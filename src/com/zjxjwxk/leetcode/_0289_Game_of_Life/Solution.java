package com.zjxjwxk.leetcode._0289_Game_of_Life;

/**
 * 使用额外的状态
 *
 * @author Xinkang Wu
 * @date 2025/10/26 14:05
 */
public class Solution {

    private static final int[] DIRECTIONS = {0, 1, -1};

    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        for (int row = 0; row < m; ++row) {
            for (int col = 0; col < n; ++col) {
                int cell = board[row][col], aliveNeighborCount = 0;
                for (int i = 0; i < 3; ++i) {
                    for (int j = 0; j < 3; ++j) {
                        int neighborRow = row + DIRECTIONS[i];
                        int neighborCol = col + DIRECTIONS[j];
                        if (!(neighborRow == row && neighborCol == col)
                                && neighborRow >= 0 && neighborRow < m
                                && neighborCol >= 0 && neighborCol < n
                                && Math.abs(board[neighborRow][neighborCol]) == 1) {
                            ++aliveNeighborCount;
                        }
                    }
                }
                if (cell == 0 && aliveNeighborCount == 3) {
                    board[row][col] = 2;
                }
                if (cell == 1 && (aliveNeighborCount < 2 || aliveNeighborCount > 3)) {
                    board[row][col] = -1;
                }
            }
        }
        for (int row = 0; row < m; ++row) {
            for (int col = 0; col < n; ++col) {
                int cell = board[row][col];
                if (cell == -1) {
                    board[row][col] = 0;
                } else if (cell == 2) {
                    board[row][col] = 1;
                }
            }
        }
    }
}
