package com.zjxjwxk.leetcode._0493_Reverse_Pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reversePairs1() {
        int[] nums = {1, 3, 2, 3, 1};
        int ans = 2;
        assertEquals(ans, solution.reversePairs(nums));
    }

    @Test
    void reversePairs2() {
        int[] nums = {2, 4, 3, 5, 1};
        int ans = 3;
        assertEquals(ans, solution.reversePairs(nums));
    }
}