package com.zjxjwxk.leetcode._0084_Largest_Rectangle_in_Histogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void largestRectangleArea1() {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int ans = 10;
        assertEquals(ans, solution2.largestRectangleArea(heights));
    }

    @Test
    void largestRectangleArea2() {
        int[] heights = {0, 1};
        int ans = 1;
        assertEquals(ans, solution2.largestRectangleArea(heights));
    }

    @Test
    void largestRectangleArea3() {
        int[] heights = {};
        int ans = 0;
        assertEquals(ans, solution2.largestRectangleArea(heights));
    }
}