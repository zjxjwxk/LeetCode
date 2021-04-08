package com.zjxjwxk.leetcode._0081_Search_in_Rotated_Sorted_Array_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void search1() {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        assertTrue(solution.search(nums, target));
    }

    @Test
    void search2() {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        assertFalse(solution.search(nums, target));
    }

    @Test
    void search3() {
        int[] nums = {1, 0, 1, 1, 1};
        int target = 0;
        assertTrue(solution.search(nums, target));
    }
}