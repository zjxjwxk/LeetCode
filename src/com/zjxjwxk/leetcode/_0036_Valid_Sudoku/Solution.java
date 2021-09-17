package com.zjxjwxk.leetcode._0036_Valid_Sudoku;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2021/9/17 11:49
 */
public class Solution {

    public boolean isValidSudoku(char[][] board) {
        boolean[][][] hashTable = new boolean[3][9][9];
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                char ch = board[i][j];
                if (ch != '.') {
                    int chIndex = ch - '0' - 1;
                    int bigIndex = (i / 3) * 3 + (j / 3);
                    if (hashTable[0][i][chIndex] || hashTable[1][j][chIndex] || hashTable[2][bigIndex][chIndex]) {
                        return false;
                    }
                    hashTable[0][i][chIndex] = true;
                    hashTable[1][j][chIndex] = true;
                    hashTable[2][bigIndex][chIndex] = true;
                }
            }
        }
        return true;
    }
}
