package com.zjxjwxk.leetcode._0413_Arithmetic_Slices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void numberOfArithmeticSlices1() {
        int[] nums = {1, 2, 3, 4};
        int ans = 3;
        assertEquals(ans, solution2.numberOfArithmeticSlices(nums));
    }

    @Test
    void numberOfArithmeticSlices2() {
        int[] nums = {1};
        int ans = 0;
        assertEquals(ans, solution2.numberOfArithmeticSlices(nums));
    }

    @Test
    void numberOfArithmeticSlices3() {
        int[] nums = {1, 2, 3, 4, 5};
        int ans = 6;
        assertEquals(ans, solution2.numberOfArithmeticSlices(nums));
    }

    @Test
    void numberOfArithmeticSlices4() {
        int[] nums = {1, 2, 3, 8, 9, 10};
        int ans = 2;
        assertEquals(ans, solution2.numberOfArithmeticSlices(nums));
    }
}