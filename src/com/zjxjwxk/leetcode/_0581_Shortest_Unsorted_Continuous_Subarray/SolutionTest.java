package com.zjxjwxk.leetcode._0581_Shortest_Unsorted_Continuous_Subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findUnsortedSubarray1() {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        int ans = 5;
        assertEquals(ans, solution.findUnsortedSubarray(nums));
    }

    @Test
    void findUnsortedSubarray2() {
        int[] nums = {1, 2, 3, 4};
        int ans = 0;
        assertEquals(ans, solution.findUnsortedSubarray(nums));
    }

    @Test
    void findUnsortedSubarray3() {
        int[] nums = {1};
        int ans = 0;
        assertEquals(ans, solution.findUnsortedSubarray(nums));
    }
}