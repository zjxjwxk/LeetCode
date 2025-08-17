package com.zjxjwxk.leetcode._0045_Jump_Game_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void jump() {
        int[] nums = {2, 3, 1, 1, 4};
        int ans = 2;
        assertEquals(ans, solution.jump(nums));
    }

    @Test
    void jump2() {
        int[] nums = {2, 3, 0, 1, 4};
        int ans = 2;
        assertEquals(ans, solution.jump(nums));
    }

    @Test
    void jump3() {
        int[] nums = {0};
        int ans = 0;
        assertEquals(ans, solution.jump(nums));
    }

    @Test
    void jump4() {
        int[] nums = {1, 2, 3};
        int ans = 2;
        assertEquals(ans, solution.jump(nums));
    }
}