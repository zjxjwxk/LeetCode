package com.zjxjwxk.leetcode._0153_Find_Minimum_in_Rotated_Sorted_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMin1() {
        int[] nums = {3, 4, 5, 1, 2};
        int ans = 1;
        assertEquals(ans, solution.findMin(nums));
    }

    @Test
    void findMin2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int ans = 0;
        assertEquals(ans, solution.findMin(nums));
    }

    @Test
    void findMin3() {
        int[] nums = {11, 13, 15, 17};
        int ans = 11;
        assertEquals(ans, solution.findMin(nums));
    }
}