package com.zjxjwxk.leetcode._0136_Single_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void singleNumber1() {
        int[] nums = {2, 2, 1};
        int ans = 1;
        assertEquals(ans, solution.singleNumber(nums));
    }

    @Test
    void singleNumber2() {
        int[] nums = {4, 1, 2, 1, 2};
        int ans = 4;
        assertEquals(ans, solution.singleNumber(nums));
    }
}