package com.zjxjwxk.leetcode._0679_24_Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void judgePoint241() {
        int[] cards = {4, 1, 8, 7};
        assertTrue(solution.judgePoint24(cards));
    }

    @Test
    void judgePoint242() {
        int[] cards = {1, 2, 1, 2};
        assertFalse(solution.judgePoint24(cards));
    }
}