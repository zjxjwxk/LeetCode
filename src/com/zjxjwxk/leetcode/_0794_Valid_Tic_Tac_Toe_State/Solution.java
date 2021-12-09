package com.zjxjwxk.leetcode._0794_Valid_Tic_Tac_Toe_State;

/**
 * 分类讨论
 * @author Xinkang Wu
 * @date 2021/12/9 17:16
 */
public class Solution {

    public boolean validTicTacToe(String[] board) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                char ch = board[i].charAt(j);
                if (ch == 'X') {
                    ++count1;
                } else if (ch == 'O') {
                    ++count2;
                }
            }
        }
        if (count1 != count2 && count1 != count2 + 1) {
            return false;
        }
        boolean win1 = win(board, 'X'), win2 = win(board, 'O');
        if (win1 && win2) {
            return false;
        }
        if (win1 && count1 == count2) {
            return false;
        }
        return !(win2 && count1 == count2 + 1);
    }

    private boolean win(String[] board, char player) {
        for (int i = 0; i < 3; ++i) {
            if (player == board[i].charAt(0) && player == board[i].charAt(1) && player == board[i].charAt(2)) {
                return true;
            }
            if (player == board[0].charAt(i) && player == board[1].charAt(i) && player == board[2].charAt(i)) {
                return true;
            }
        }
        if (player == board[0].charAt(0) && player == board[1].charAt(1) && player == board[2].charAt(2)) {
            return true;
        }
        return player == board[0].charAt(2) && player == board[1].charAt(1) && player == board[2].charAt(0);
    }
}
