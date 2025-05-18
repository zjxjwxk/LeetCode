package com.zjxjwxk.leetcode._0128_Longest_Consecutive_Sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestConsecutive() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int ans = 4;
        assertEquals(ans, solution.longestConsecutive(nums));
    }

    @Test
    void longestConsecutive2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int ans = 9;
        assertEquals(ans, solution.longestConsecutive(nums));
    }

    @Test
    void longestConsecutive3() {
        int[] nums = {1, 0, 1, 2};
        int ans = 3;
        assertEquals(ans, solution.longestConsecutive(nums));
    }
}