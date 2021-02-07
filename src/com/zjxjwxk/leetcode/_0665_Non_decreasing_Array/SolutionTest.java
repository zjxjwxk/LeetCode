package com.zjxjwxk.leetcode._0665_Non_decreasing_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkPossibility1() {
        int[] nums = {4, 2, 3};
        assertTrue(solution.checkPossibility(nums));
    }

    @Test
    void checkPossibility2() {
        int[] nums = {4, 2, 1};
        assertFalse(solution.checkPossibility(nums));
    }

    @Test
    void checkPossibility3() {
        int[] nums = {3, 4, 2, 3};
        assertFalse(solution.checkPossibility(nums));
    }

    @Test
    void checkPossibility4() {
        int[] nums = {5, 7, 1, 8};
        assertTrue(solution.checkPossibility(nums));
    }
}