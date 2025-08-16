package com.zjxjwxk.leetcode._0055_Jump_Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canJump() {
        int[] nums = {2, 3, 1, 1, 4};
        assertTrue(solution.canJump(nums));
    }

    @Test
    void canJump2() {
        int[] nums = {3, 2, 1, 0, 4};
        assertFalse(solution.canJump(nums));
    }
}