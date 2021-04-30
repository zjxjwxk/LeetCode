package com.zjxjwxk.leetcode._0137_Single_Number_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void singleNumber1() {
        int[] nums = {2, 2, 3, 2};
        int ans = 3;
        assertEquals(ans, solution.singleNumber(nums));
    }

    @Test
    void singleNumber2() {
        int[] nums = {0, 1, 0, 1, 0, 1, 99};
        int ans = 99;
        assertEquals(ans, solution.singleNumber(nums));
    }
}