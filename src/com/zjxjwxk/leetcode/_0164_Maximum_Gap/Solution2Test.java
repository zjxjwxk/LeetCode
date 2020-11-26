package com.zjxjwxk.leetcode._0164_Maximum_Gap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void maximumGap1() {
        int[] nums = {3, 6, 9, 1};
        int ans = 3;
        assertEquals(ans, solution2.maximumGap(nums));
    }

    @Test
    void maximumGap2() {
        int[] nums = {10};
        int ans = 0;
        assertEquals(ans, solution2.maximumGap(nums));
    }
}