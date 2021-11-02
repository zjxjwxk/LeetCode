package com.zjxjwxk.leetcode._0260_Single_Number_III;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void singleNumber1() {
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] ans = {3, 5};
        assertArrayEquals(ans, solution.singleNumber(nums));
    }

    @Test
    void singleNumber2() {
        int[] nums = {-1, 0};
        int[] ans = {-1, 0};
        assertArrayEquals(ans, solution.singleNumber(nums));
    }

    @Test
    void singleNumber3() {
        int[] nums = {0, 1};
        int[] ans = {1, 0};
        assertArrayEquals(ans, solution.singleNumber(nums));
    }
}