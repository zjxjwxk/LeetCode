package com.zjxjwxk.leetcode._0004_Median_of_Two_Sorted_Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMedianSortedArrays1() {
        int[] nums1 = {1, 3}, nums2 = {2};
        double ans = 2;
        assertEquals(ans, solution.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays2() {
        int[] nums1 = {1, 2}, nums2 = {3, 4};
        double ans = 2.5;
        assertEquals(ans, solution.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays3() {
        int[] nums1 = {1}, nums2 = {2};
        double ans = 1.5;
        assertEquals(ans, solution.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays4() {
        int[] nums1 = {1, 2}, nums2 = {};
        double ans = 1.5;
        assertEquals(ans, solution.findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void findMedianSortedArrays5() {
        int[] nums1 = {}, nums2 = {1};
        double ans = 1;
        assertEquals(ans, solution.findMedianSortedArrays(nums1, nums2));
    }
}