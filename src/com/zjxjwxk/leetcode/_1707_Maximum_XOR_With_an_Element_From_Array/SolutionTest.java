package com.zjxjwxk.leetcode._1707_Maximum_XOR_With_an_Element_From_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximizeXor1() {
        int[] nums = {0, 1, 2, 3, 4};
        int[][] queries = {
                {3, 1}, {1, 3}, {5, 6}
        };
        int[] ans = {3, 3, 7};
        assertArrayEquals(ans, solution.maximizeXor(nums, queries));
    }

    @Test
    void maximizeXor2() {
        int[] nums = {5, 2, 4, 6, 6, 3};
        int[][] queries = {
                {12, 4}, {8, 1}, {6, 3}
        };
        int[] ans = {15, -1, 5};
        assertArrayEquals(ans, solution.maximizeXor(nums, queries));
    }
}