package com.zjxjwxk.leetcode._0912_Sort_an_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortArray1() {
        int[] nums = {5, 2, 3, 1};
        int[] ans = {1, 2, 3, 5};
        assertArrayEquals(ans, solution.sortArray(nums));
    }

    @Test
    void sortArray2() {
        int[] nums = {5, 1, 1, 2, 0, 0};
        int[] ans = {0, 0, 1, 1, 2, 5};
        assertArrayEquals(ans, solution.sortArray(nums));
    }
}