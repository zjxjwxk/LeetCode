package com.zjxjwxk.leetcode._0033_Search_in_Rotated_Sorted_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void search1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int ans = 4;
        assertEquals(ans, solution.search(nums, target));
    }

    @Test
    void search2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int ans = -1;
        assertEquals(ans, solution.search(nums, target));
    }

    @Test
    void search3() {
        int[] nums = {1};
        int target = 0;
        int ans = -1;
        assertEquals(ans, solution.search(nums, target));
    }

    @Test
    void search4() {
        int[] nums = {1, 3};
        int target = 1;
        int ans = 0;
        assertEquals(ans, solution.search(nums, target));
    }

    @Test
    void search5() {
        int[] nums = {1, 3};
        int target = 3;
        int ans = 1;
        assertEquals(ans, solution.search(nums, target));
    }

    @Test
    void search6() {
        int[] nums = {1, 3};
        int target = 0;
        int ans = -1;
        assertEquals(ans, solution.search(nums, target));
    }

    @Test
    void search7() {
        int[] nums = {1, 3};
        int target = 4;
        int ans = -1;
        assertEquals(ans, solution.search(nums, target));
    }

    @Test
    void search8() {
        int[] nums = {1, 3};
        int target = 2;
        int ans = -1;
        assertEquals(ans, solution.search(nums, target));
    }
}