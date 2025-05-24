package com.zjxjwxk.leetcode._0283_Move_Zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void moveZeroes1() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] ans = {1, 3, 12, 0, 0};
        solution2.moveZeroes(nums);
        assertArrayEquals(ans, nums);
    }

    @Test
    void moveZeroes2() {
        int[] nums = {1};
        int[] ans = {1};
        solution2.moveZeroes(nums);
        assertArrayEquals(ans, nums);
    }

    @Test
    void moveZeroes3() {
        int[] nums = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        int[] ans = {4, 2, 4, 3, 5, 1, 0, 0, 0, 0};
        solution2.moveZeroes(nums);
        assertArrayEquals(ans, nums);
    }
}