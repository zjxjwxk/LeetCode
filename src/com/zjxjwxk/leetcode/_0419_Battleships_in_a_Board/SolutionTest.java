package com.zjxjwxk.leetcode._0419_Battleships_in_a_Board;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countBattleships1() {
        char[][] board = {{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}};
        int ans = 2;
        assertEquals(ans, solution.countBattleships(board));
    }

    @Test
    void countBattleships2() {
        char[][] board = {{'.'}};
        int ans = 0;
        assertEquals(ans, solution.countBattleships(board));
    }

    @Test
    void countBattleships3() {
        char[][] board = {{'.', 'X', 'X', 'X'}, {'X', '.', '.', '.'}, {'.', '.', 'X', 'X'}};
        int ans = 3;
        assertEquals(ans, solution.countBattleships(board));
    }
}