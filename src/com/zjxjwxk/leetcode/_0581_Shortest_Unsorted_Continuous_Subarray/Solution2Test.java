package com.zjxjwxk.leetcode._0581_Shortest_Unsorted_Continuous_Subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void findUnsortedSubarray1() {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        int ans = 5;
        assertEquals(ans, solution2.findUnsortedSubarray(nums));
    }

    @Test
    void findUnsortedSubarray2() {
        int[] nums = {1, 2, 3, 4};
        int ans = 0;
        assertEquals(ans, solution2.findUnsortedSubarray(nums));
    }

    @Test
    void findUnsortedSubarray3() {
        int[] nums = {1};
        int ans = 0;
        assertEquals(ans, solution2.findUnsortedSubarray(nums));
    }
}