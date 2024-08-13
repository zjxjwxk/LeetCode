package com.zjxjwxk.leetcode._3151_Special_Array_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isArraySpecial() {
        int[] nums = {1};
        assertTrue(solution.isArraySpecial(nums));
    }

    @Test
    void isArraySpecial2() {
        int[] nums = {2, 1, 4};
        assertTrue(solution.isArraySpecial(nums));
    }

    @Test
    void isArraySpecial3() {
        int[] nums = {4, 3, 1, 6};
        assertFalse(solution.isArraySpecial(nums));
    }
}