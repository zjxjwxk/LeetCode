package com.zjxjwxk.leetcode._0238_Product_of_Array_Except_Self;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void constructArr() {
        int[] nums = {1, 2, 3, 4};
        int[] ans = {24, 12, 8, 6};
        assertArrayEquals(ans, solution.productExceptSelf(nums));
    }
}