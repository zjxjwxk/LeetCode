package com.zjxjwxk.leetcode._0794_Valid_Tic_Tac_Toe_State;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void validTicTacToe1() {
        String[] board = {"O  ", "   ", "   "};
        assertFalse(solution.validTicTacToe(board));
    }

    @Test
    void validTicTacToe2() {
        String[] board = {"XOX", " X ", "   "};
        assertFalse(solution.validTicTacToe(board));
    }

    @Test
    void validTicTacToe3() {
        String[] board = {"XXX", "   ", "OOO"};
        assertFalse(solution.validTicTacToe(board));
    }

    @Test
    void validTicTacToe4() {
        String[] board = {"XOX", "O O", "XOX"};
        assertTrue(solution.validTicTacToe(board));
    }

    @Test
    void validTicTacToe5() {
        String[] board = {"XXX", "XOO", "OO "};
        assertFalse(solution.validTicTacToe(board));
    }
}