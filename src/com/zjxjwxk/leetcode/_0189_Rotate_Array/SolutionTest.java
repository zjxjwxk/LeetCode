package com.zjxjwxk.leetcode._0189_Rotate_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rotate1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate(nums, k);
        int[] ans = {5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(ans, nums);
    }

    @Test
    void rotate2() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        solution.rotate(nums, k);
        int[] ans = {3, 99, -1, -100};
        assertArrayEquals(ans, nums);
    }

    @Test
    void rotate3() {
        int[] nums = {1};
        int k = 3;
        solution.rotate(nums, k);
        int[] ans = {1};
        assertArrayEquals(ans, nums);
    }

    @Test
    void rotate4() {
        int[] nums = {};
        int k = 3;
        solution.rotate(nums, k);
        int[] ans = {};
        assertArrayEquals(ans, nums);
    }
}