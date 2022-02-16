package com.zjxjwxk.leetcode._0152_Maximum_Product_Subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxProduct1() {
        int[] nums = {2, 3, -2, 4};
        int ans = 6;
        assertEquals(ans, solution.maxProduct(nums));
    }

    @Test
    void maxProduct2() {
        int[] nums = {-2, 0, -1};
        int ans = 0;
        assertEquals(ans, solution.maxProduct(nums));
    }
}