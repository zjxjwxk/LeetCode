package com.zjxjwxk.leetcode._0419_Battleships_in_a_Board;

/**
 * 枚举起点
 * @author Xinkang Wu
 * @date 2021/12/18 14:47
 */
public class Solution {

    public int countBattleships(char[][] board) {
        int m = board.length, n = board[0].length, ans = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[i][j] == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')) {
                    ++ans;
                }
            }
        }
        return ans;
    }
}
