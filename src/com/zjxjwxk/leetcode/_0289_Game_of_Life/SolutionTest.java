package com.zjxjwxk.leetcode._0289_Game_of_Life;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void gameOfLife() {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        int[][] ans = {
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };
        solution.gameOfLife(board);
        assertArrayEquals(ans, board);
    }

    @Test
    void gameOfLife2() {
        int[][] board = {
                {1, 1},
                {1, 0}
        };
        int[][] ans = {
                {1, 1},
                {1, 1}
        };
        solution.gameOfLife(board);
        assertArrayEquals(ans, board);
    }
}