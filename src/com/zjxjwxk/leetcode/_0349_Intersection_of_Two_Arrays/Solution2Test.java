package com.zjxjwxk.leetcode._0349_Intersection_of_Two_Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void intersection() {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2}, ans = {2};
        assertArrayEquals(ans, solution2.intersection(nums1, nums2));
        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        ans = new int[]{4, 9};
        assertArrayEquals(ans, solution2.intersection(nums1, nums2));
    }
}