package com.zjxjwxk.leetcode._0414_Third_Maximum_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void thirdMax1() {
        int[] nums = {3, 2, 1};
        int ans = 1;
        assertEquals(ans, solution.thirdMax(nums));
    }

    @Test
    void thirdMax2() {
        int[] nums = {1, 2};
        int ans = 2;
        assertEquals(ans, solution.thirdMax(nums));
    }

    @Test
    void thirdMax3() {
        int[] nums = {2, 2, 3, 1};
        int ans = 1;
        assertEquals(ans, solution.thirdMax(nums));
    }
}