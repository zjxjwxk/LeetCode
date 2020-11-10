package com.zjxjwxk.leetcode._0031_Next_Permutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void nextPermutation1() {
        int[] nums = {1, 2, 3};
        int[] ans = {1, 3, 2};
        solution.nextPermutation(nums);
        assertArrayEquals(ans, nums);
    }

    @Test
    void nextPermutation2() {
        int[] nums = {3, 2, 1};
        int[] ans = {1, 2, 3};
        solution.nextPermutation(nums);
        assertArrayEquals(ans, nums);
    }

    @Test
    void nextPermutation3() {
        int[] nums = {1, 1, 5};
        int[] ans = {1, 5, 1};
        solution.nextPermutation(nums);
        assertArrayEquals(ans, nums);
    }
}