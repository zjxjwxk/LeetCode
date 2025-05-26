package com.zjxjwxk.leetcode._0042_Trapping_Rain_Water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution4Test {

    private final Solution4 solution4 = new Solution4();

    @Test
    void trap1() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = 6;
        assertEquals(ans, solution4.trap(height));
    }

    @Test
    void trap2() {
        int[] height = {4, 2, 0, 3, 2, 5};
        int ans = 9;
        assertEquals(ans, solution4.trap(height));
    }
}