package com.zjxjwxk.leetcode._0628_Maximum_Product_of_Three_Numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumProduct1() {
        int[] nums = {1, 2, 3};
        int ans = 6;
        assertEquals(ans, solution.maximumProduct(nums));
    }

    @Test
    void maximumProduct2() {
        int[] nums = {1, 2, 3, 4};
        int ans = 24;
        assertEquals(ans, solution.maximumProduct(nums));
    }

    @Test
    void maximumProduct3() {
        int[] nums = {-3, -2, -1, 0};
        int ans = 0;
        assertEquals(ans, solution.maximumProduct(nums));
    }

    @Test
    void maximumProduct4() {
        int[] nums = {-3, -2, -1, 2};
        int ans = 12;
        assertEquals(ans, solution.maximumProduct(nums));
    }

    @Test
    void maximumProduct5() {
        int[] nums = {7, 3, 1, 0, 0, 6};
        int ans = 126;
        assertEquals(ans, solution.maximumProduct(nums));
    }
}