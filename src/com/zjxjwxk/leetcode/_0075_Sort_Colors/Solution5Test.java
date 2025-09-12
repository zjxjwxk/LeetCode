package com.zjxjwxk.leetcode._0075_Sort_Colors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Solution5Test {

    private final Solution5 solution5 = new Solution5();

    @Test
    void sortColors() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] ans = {0, 0, 1, 1, 2, 2};
        solution5.sortColors(nums);
        assertArrayEquals(ans, nums);
    }

    @Test
    void sortColors2() {
        int[] nums = {2, 0, 1};
        int[] ans = {0, 1, 2};
        solution5.sortColors(nums);
        assertArrayEquals(ans, nums);
    }

    @Test
    void sortColors3() {
        int[] nums = {2, 1, 0, 1};
        int[] ans = {0, 1, 1, 2};
        solution5.sortColors(nums);
        assertArrayEquals(ans, nums);
    }

    @Test
    void sortColors4() {
        int[] nums = {1, 2, 0};
        int[] ans = {0, 1, 2};
        solution5.sortColors(nums);
        assertArrayEquals(ans, nums);
    }
}