package com.zjxjwxk.leetcode._0292_Nim_Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canWinNim1() {
        int n = 4;
        assertFalse(solution.canWinNim(n));
    }

    @Test
    void canWinNim2() {
        int n = 1;
        assertTrue(solution.canWinNim(n));
    }

    @Test
    void canWinNim3() {
        int n = 2;
        assertTrue(solution.canWinNim(n));
    }
}