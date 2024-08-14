package com.zjxjwxk.leetcode._3152_Special_Array_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isArraySpecial() {
        int[] nums = {3, 4, 1, 2, 6};
        int[][] queries = {{0, 4}};
        boolean[] ans = {false};
        assertArrayEquals(ans, solution.isArraySpecial(nums, queries));
    }

    @Test
    void isArraySpecial2() {
        int[] nums = {4, 3, 1, 6};
        int[][] queries = {{0, 2}, {2, 3}};
        boolean[] ans = {false, true};
        assertArrayEquals(ans, solution.isArraySpecial(nums, queries));
    }
}