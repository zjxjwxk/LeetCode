package com.zjxjwxk.leetcode._0154_Find_Minimum_in_Rotated_Sorted_Array_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMin1() {
        int[] nums = {1, 3, 5};
        int ans = 1;
        assertEquals(ans, solution.findMin(nums));
    }

    @Test
    void findMin2() {
        int[] nums = {2, 2, 2, 0, 1};
        int ans = 0;
        assertEquals(ans, solution.findMin(nums));
    }
}