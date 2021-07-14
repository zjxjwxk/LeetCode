package com.zjxjwxk.leetcode._1818_Minimum_Absolute_Sum_Difference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minAbsoluteSumDiff1() {
        int[] nums1 = {1, 7, 5};
        int[] nums2 = {2, 3, 5};
        int ans = 3;
        assertEquals(ans, solution.minAbsoluteSumDiff(nums1, nums2));
    }

    @Test
    void minAbsoluteSumDiff2() {
        int[] nums1 = {1, 10, 4, 4, 2, 7};
        int[] nums2 = {9, 3, 5, 1, 7, 4};
        int ans = 20;
        assertEquals(ans, solution.minAbsoluteSumDiff(nums1, nums2));
    }
}