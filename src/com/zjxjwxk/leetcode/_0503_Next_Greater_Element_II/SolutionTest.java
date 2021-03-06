package com.zjxjwxk.leetcode._0503_Next_Greater_Element_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void nextGreaterElements1() {
        int[] nums = {1, 2, 1};
        int[] ans = {2, -1, 2};
        assertArrayEquals(ans, solution.nextGreaterElements(nums));
    }

    @Test
    void nextGreaterElements2() {
        int[] nums = {5, 4, 3, 2, 1};
        int[] ans = {-1, 5, 5, 5, 5};
        assertArrayEquals(ans, solution.nextGreaterElements(nums));
    }

    @Test
    void nextGreaterElements3() {
        int[] nums = {1, 1, 1, 1, 1};
        int[] ans = {-1, -1, -1, -1, -1};
        assertArrayEquals(ans, solution.nextGreaterElements(nums));
    }
}