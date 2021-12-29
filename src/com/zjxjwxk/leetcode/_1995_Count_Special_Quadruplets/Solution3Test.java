package com.zjxjwxk.leetcode._1995_Count_Special_Quadruplets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void countQuadruplets1() {
        int[] nums = {1, 2, 3, 6};
        int ans = 1;
        assertEquals(ans, solution3.countQuadruplets(nums));
    }

    @Test
    void countQuadruplets2() {
        int[] nums = {3, 3, 6, 4, 5};
        int ans = 0;
        assertEquals(ans, solution3.countQuadruplets(nums));
    }

    @Test
    void countQuadruplets3() {
        int[] nums = {1, 1, 1, 3, 5};
        int ans = 4;
        assertEquals(ans, solution3.countQuadruplets(nums));
    }
}