package com.zjxjwxk.leetcode._0773_Sliding_Puzzle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void slidingPuzzle1() {
        int[][] board = {{1, 2, 3}, {4, 0, 5}};
        int ans = 1;
        assertEquals(ans, solution.slidingPuzzle(board));
    }

    @Test
    void slidingPuzzle2() {
        int[][] board = {{1, 2, 3}, {5, 4, 0}};
        int ans = -1;
        assertEquals(ans, solution.slidingPuzzle(board));
    }

    @Test
    void slidingPuzzle3() {
        int[][] board = {{4, 1, 2}, {5, 0, 3}};
        int ans = 5;
        assertEquals(ans, solution.slidingPuzzle(board));
    }

    @Test
    void slidingPuzzle4() {
        int[][] board = {{3, 2, 4}, {1, 5, 0}};
        int ans = 14;
        assertEquals(ans, solution.slidingPuzzle(board));
    }
}