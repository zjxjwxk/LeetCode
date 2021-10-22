package com.zjxjwxk.leetcode._0169_Majority_Element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void majorityElement1() {
        int[] nums = {3, 2, 3};
        int ans = 3;
        assertEquals(ans, solution.majorityElement(nums));
    }

    @Test
    void majorityElement2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int ans = 2;
        assertEquals(ans, solution.majorityElement(nums));
    }
}