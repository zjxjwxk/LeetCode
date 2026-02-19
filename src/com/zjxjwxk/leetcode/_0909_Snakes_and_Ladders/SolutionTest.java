package com.zjxjwxk.leetcode._0909_Snakes_and_Ladders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void snakesAndLadders() {
        int[][] board = {
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };
        int ans = 4;
        assertEquals(ans, solution.snakesAndLadders(board));
    }

    @Test
    void snakesAndLadders2() {
        int[][] board = {
                {-1, 10, -1, 15, -1},
                {-1, -1, 18, 2, 20},
                {-1, -1, 12, -1, -1},
                {2, 4, 11, 18, 8},
                {-1, -1, -1, -1, -1}
        };
        int ans = 3;
        assertEquals(ans, solution.snakesAndLadders(board));
    }
}