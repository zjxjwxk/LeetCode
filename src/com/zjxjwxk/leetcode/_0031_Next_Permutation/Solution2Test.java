package com.zjxjwxk.leetcode._0031_Next_Permutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void nextPermutation1() {
        int[] nums = {1, 2, 3};
        int[] ans = {1, 3, 2};
        solution2.nextPermutation(nums);
        assertArrayEquals(ans, nums);
    }

    @Test
    void nextPermutation2() {
        int[] nums = {3, 2, 1};
        int[] ans = {1, 2, 3};
        solution2.nextPermutation(nums);
        assertArrayEquals(ans, nums);
    }

    @Test
    void nextPermutation3() {
        int[] nums = {1, 1, 5};
        int[] ans = {1, 5, 1};
        solution2.nextPermutation(nums);
        assertArrayEquals(ans, nums);
    }

    @Test
    void nextPermutation4() {
        int[] nums = {4, 2, 0, 2, 3, 2, 0};
        int[] ans = {4, 2, 0, 3, 0, 2, 2};
        solution2.nextPermutation(nums);
        assertArrayEquals(ans, nums);
    }
}