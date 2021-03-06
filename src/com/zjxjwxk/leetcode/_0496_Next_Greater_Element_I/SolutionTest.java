package com.zjxjwxk.leetcode._0496_Next_Greater_Element_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void nextGreaterElement1() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] ans = {-1, 3, -1};
        assertArrayEquals(ans, solution.nextGreaterElement(nums1, nums2));
    }

    @Test
    void nextGreaterElement2() {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] ans = {3, -1};
        assertArrayEquals(ans, solution.nextGreaterElement(nums1, nums2));
    }
}