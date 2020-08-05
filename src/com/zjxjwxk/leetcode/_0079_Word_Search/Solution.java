package com.zjxjwxk.leetcode._0079_Word_Search;

/**
 * @author zjxjwxk
 * @date 2020/8/5 10:57 下午
 */
public class Solution {

    private static int index = 0;

    public static boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        int row = board.length, col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (existDFS(board, row, col, i, j, word, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean existDFS(char[][] board, int row, int col, int i, int j, String word, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }
        boolean exist = false;
        if (i >= 0 && i < row && j >= 0 && j < col && !visited[i][j] && board[i][j] == word.charAt(index)) {
            ++index;
            visited[i][j] = true;
            exist = existDFS(board, row, col, i + 1, j, word, visited)
                    || existDFS(board, row, col, i, j + 1, word, visited)
                    || existDFS(board, row, col, i - 1, j, word, visited)
                    || existDFS(board, row, col, i, j - 1, word, visited);
            if (!exist) {
                --index;
                visited[i][j] = false;
            }
        }
        return exist;
    }

    public static void main(String[] args) {
        char[][] board = new char[][] {
                {'a','b','c','e'},
                {'s','f','c','s'},
                {'a','d','e','e'}
        };
        System.out.println(exist(board, "bfce"));
    }
}
