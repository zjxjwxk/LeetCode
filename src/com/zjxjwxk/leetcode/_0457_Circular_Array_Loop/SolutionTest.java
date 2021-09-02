package com.zjxjwxk.leetcode._0457_Circular_Array_Loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void circularArrayLoop1() {
        int[] nums = {2, -1, 1, 2, 2};
        assertTrue(solution.circularArrayLoop(nums));
    }

    @Test
    void circularArrayLoop2() {
        int[] nums = {-1, 2};
        assertFalse(solution.circularArrayLoop(nums));
    }

    @Test
    void circularArrayLoop3() {
        int[] nums = {-2, 1, -1, -2, -2};
        assertFalse(solution.circularArrayLoop(nums));
    }
}