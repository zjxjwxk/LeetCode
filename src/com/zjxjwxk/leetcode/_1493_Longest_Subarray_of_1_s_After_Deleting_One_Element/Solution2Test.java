package com.zjxjwxk.leetcode._1493_Longest_Subarray_of_1_s_After_Deleting_One_Element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void longestSubarray1() {
        int[] nums = {1, 1, 0, 1};
        int ans = 3;
        assertEquals(ans, solution2.longestSubarray(nums));
    }

    @Test
    void longestSubarray2() {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int ans = 5;
        assertEquals(ans, solution2.longestSubarray(nums));
    }

    @Test
    void longestSubarray3() {
        int[] nums = {1, 1, 1};
        int ans = 2;
        assertEquals(ans, solution2.longestSubarray(nums));
    }

    @Test
    void longestSubarray4() {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        int ans = 4;
        assertEquals(ans, solution2.longestSubarray(nums));
    }

    @Test
    void longestSubarray5() {
        int[] nums = {0, 0, 0};
        int ans = 0;
        assertEquals(ans, solution2.longestSubarray(nums));
    }
}