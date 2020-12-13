package com.zjxjwxk.leetcode._0217_Contains_Duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void containsDuplicate1() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    void containsDuplicate2() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    void containsDuplicate3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4,};
        assertTrue(solution.containsDuplicate(nums));
    }
}