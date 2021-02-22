package com.zjxjwxk.leetcode._1438_Longest_Continuous_Subarray_With_Absolute_Diff_Less_Than_or_Equal_to_Limit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestSubarray1() {
        int[] nums = {8, 2, 4, 7};
        int limit = 4;
        int ans = 2;
        assertEquals(ans, solution.longestSubarray(nums, limit));
    }

    @Test
    void longestSubarray2() {
        int[] nums = {10, 1, 2, 4, 7, 2};
        int limit = 5;
        int ans = 4;
        assertEquals(ans, solution.longestSubarray(nums, limit));
    }
}