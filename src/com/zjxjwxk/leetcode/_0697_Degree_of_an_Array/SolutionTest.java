package com.zjxjwxk.leetcode._0697_Degree_of_an_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findShortestSubArray1() {
        int[] nums = {1, 2, 2, 3, 1};
        int ans = 2;
        assertEquals(ans, solution.findShortestSubArray(nums));
    }

    @Test
    void findShortestSubArray2() {
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        int ans = 6;
        assertEquals(ans, solution.findShortestSubArray(nums));
    }
}