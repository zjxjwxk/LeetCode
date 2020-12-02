package com.zjxjwxk.leetcode._0321_Create_Maximum_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxNumber1() {
        int[] nums1 = {3, 4, 6, 5};
        int[] nums2 = {9, 1, 2, 5, 8, 3};
        int k = 5;
        int[] ans = {9, 8, 6, 5, 3};
        assertArrayEquals(ans, solution.maxNumber(nums1, nums2, k));
    }

    @Test
    void maxNumber2() {
        int[] nums1 = {6, 7};
        int[] nums2 = {6, 0, 4};
        int k = 5;
        int[] ans = {6, 7, 6, 0, 4};
        assertArrayEquals(ans, solution.maxNumber(nums1, nums2, k));
    }

    @Test
    void maxNumber3() {
        int[] nums1 = {3, 9};
        int[] nums2 = {8, 9};
        int k = 3;
        int[] ans = {9, 8, 9};
        assertArrayEquals(ans, solution.maxNumber(nums1, nums2, k));
    }

    @Test
    void maxNumber4() {
        int[] nums1 = {7, 6, 1, 9, 3, 2, 3, 1, 1};
        int[] nums2 = {4, 0, 9, 9, 0, 5, 5, 4, 7};
        int k = 9;
        int[] ans = {9, 9, 9, 7, 3, 2, 3, 1, 1};
        assertArrayEquals(ans, solution.maxNumber(nums1, nums2, k));
    }

    @Test
    void maxNumber5() {
        int[] nums1 = {2, 5, 6, 4, 4, 0};
        int[] nums2 = {7, 3, 8, 0, 6, 5, 7, 6, 2};
        int k = 15;
        int[] ans = {7, 3, 8, 2, 5, 6, 4, 4, 0, 6, 5, 7, 6, 2, 0};
        assertArrayEquals(ans, solution.maxNumber(nums1, nums2, k));
    }
}