package com.zjxjwxk.leetcode._0239_Sliding_Window_Maximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void maxSlidingWindow1() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = {3, 3, 5, 5, 6, 7};
        assertArrayEquals(ans, solution3.maxSlidingWindow(nums, k));
    }

    @Test
    void maxSlidingWindow2() {
        int[] nums = {1};
        int k = 1;
        int[] ans = {1};
        assertArrayEquals(ans, solution3.maxSlidingWindow(nums, k));
    }

    @Test
    void maxSlidingWindow3() {
        int[] nums = {1, -1};
        int k = 1;
        int[] ans = {1, -1};
        assertArrayEquals(ans, solution3.maxSlidingWindow(nums, k));
    }

    @Test
    void maxSlidingWindow4() {
        int[] nums = {9, 11};
        int k = 2;
        int[] ans = {11};
        assertArrayEquals(ans, solution3.maxSlidingWindow(nums, k));
    }

    @Test
    void maxSlidingWindow5() {
        int[] nums = {4, -2};
        int k = 2;
        int[] ans = {4};
        assertArrayEquals(ans, solution3.maxSlidingWindow(nums, k));
    }
}