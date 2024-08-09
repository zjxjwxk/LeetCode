package com.zjxjwxk.leetcode._3132_Find_the_Integer_Added_to_Array_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumAddedInteger() {
        int[] nums1 = {4, 20, 16, 12, 8};
        int[] nums2 = {14, 18, 10};
        int ans = -2;
        assertEquals(ans, solution.minimumAddedInteger(nums1, nums2));
    }

    @Test
    void minimumAddedInteger2() {
        int[] nums1 = {3, 5, 5, 3};
        int[] nums2 = {7, 7};
        int ans = 2;
        assertEquals(ans, solution.minimumAddedInteger(nums1, nums2));
    }

    @Test
    void minimumAddedInteger3() {
        int[] nums1 = {4, 6, 3, 1, 4, 2, 10, 9, 5};
        int[] nums2 = {5, 10, 3, 2, 6, 1, 9};
        int ans = 0;
        assertEquals(ans, solution.minimumAddedInteger(nums1, nums2));
    }

    @Test
    void minimumAddedInteger4() {
        int[] nums1 = {10, 2, 8, 7, 5, 6, 7, 10};
        int[] nums2 = {5, 8, 5, 3, 8, 4};
        int ans = -2;
        assertEquals(ans, solution.minimumAddedInteger(nums1, nums2));
    }
}