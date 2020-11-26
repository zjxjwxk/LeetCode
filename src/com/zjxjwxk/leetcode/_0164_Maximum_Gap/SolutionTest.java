package com.zjxjwxk.leetcode._0164_Maximum_Gap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumGap1() {
        int[] nums = {3, 6, 9, 1};
        int ans = 3;
        assertEquals(ans, solution.maximumGap(nums));
    }

    @Test
    void maximumGap2() {
        int[] nums = {10};
        int ans = 0;
        assertEquals(ans, solution.maximumGap(nums));
    }
}