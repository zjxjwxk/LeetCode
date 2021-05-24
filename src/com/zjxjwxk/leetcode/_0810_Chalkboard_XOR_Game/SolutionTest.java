package com.zjxjwxk.leetcode._0810_Chalkboard_XOR_Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void xorGame1() {
        int[] nums = {1, 1, 2};
        assertFalse(solution.xorGame(nums));
    }
}