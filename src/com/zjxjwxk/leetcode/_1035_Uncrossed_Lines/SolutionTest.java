package com.zjxjwxk.leetcode._1035_Uncrossed_Lines;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxUncrossedLines1() {
        int[] nums1 = {1, 4, 2};
        int[] nums2 = {1, 2, 4};
        int ans = 2;
        assertEquals(ans, solution.maxUncrossedLines(nums1, nums2));
    }

    @Test
    void maxUncrossedLines2() {
        int[] nums1 = {2, 5, 1, 2, 5};
        int[] nums2 = {10, 5, 2, 1, 5, 2};
        int ans = 3;
        assertEquals(ans, solution.maxUncrossedLines(nums1, nums2));
    }

    @Test
    void maxUncrossedLines3() {
        int[] nums1 = {1, 3, 7, 1, 7, 5};
        int[] nums2 = {1, 9, 2, 5, 1};
        int ans = 2;
        assertEquals(ans, solution.maxUncrossedLines(nums1, nums2));
    }
}