package com.zjxjwxk.leetcode._0704_Binary_Search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void search1() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int ans = 4;
        assertEquals(ans, solution.search(nums, target));
    }

    @Test
    void search2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int ans = -1;
        assertEquals(ans, solution.search(nums, target));
    }
}