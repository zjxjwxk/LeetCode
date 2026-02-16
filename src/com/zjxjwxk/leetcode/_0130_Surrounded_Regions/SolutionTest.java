package com.zjxjwxk.leetcode._0130_Surrounded_Regions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void solve() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        char[][] ans = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        solution.solve(board);
        assertArrayEquals(ans, board);
    }

    @Test
    void solve2() {
        char[][] board = {{'X'}};
        char[][] ans = {{'X'}};
        solution.solve(board);
        assertArrayEquals(ans, board);
    }
}