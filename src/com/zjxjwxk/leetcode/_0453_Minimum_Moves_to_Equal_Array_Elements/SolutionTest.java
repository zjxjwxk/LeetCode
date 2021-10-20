package com.zjxjwxk.leetcode._0453_Minimum_Moves_to_Equal_Array_Elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minMoves1() {
        int[] nums = {1, 2, 3};
        int ans = 3;
        assertEquals(ans, solution.minMoves(nums));
    }

    @Test
    void minMoves2() {
        int[] nums = {1, 1, 1};
        int ans = 0;
        assertEquals(ans, solution.minMoves(nums));
    }

    @Test
    void minMoves3() {
        int[] nums = {1};
        int ans = 0;
        assertEquals(ans, solution.minMoves(nums));
    }

    @Test
    void minMoves4() {
        int[] nums = {2, 2};
        int ans = 0;
        assertEquals(ans, solution.minMoves(nums));
    }
}