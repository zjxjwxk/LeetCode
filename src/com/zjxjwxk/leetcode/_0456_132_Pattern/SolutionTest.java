package com.zjxjwxk.leetcode._0456_132_Pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void find132pattern1() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(solution.find132pattern(nums));
    }

    @Test
    void find132pattern2() {
        int[] nums = {3, 1, 4, 2};
        assertTrue(solution.find132pattern(nums));
    }

    @Test
    void find132pattern3() {
        int[] nums = {-1, 3, 2, 0};
        assertTrue(solution.find132pattern(nums));
    }

    @Test
    void find132pattern4() {
        int[] nums = {-2, 1, 2, -2, 1, 2};
        assertTrue(solution.find132pattern(nums));
    }
}