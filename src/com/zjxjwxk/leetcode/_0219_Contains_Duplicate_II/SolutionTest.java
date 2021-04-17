package com.zjxjwxk.leetcode._0219_Contains_Duplicate_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void containsNearbyDuplicate1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    void containsNearbyDuplicate2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    void containsNearbyDuplicate3() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        assertFalse(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    void containsNearbyDuplicate4() {
        int[] nums = {99, 99};
        int k = 2;
        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }
}