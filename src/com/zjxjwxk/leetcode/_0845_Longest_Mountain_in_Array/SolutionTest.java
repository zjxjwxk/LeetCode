package com.zjxjwxk.leetcode._0845_Longest_Mountain_in_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestMountain1() {
        int[] A = {2, 1, 4, 7, 3, 2, 5};
        int ans = 5;
        assertEquals(ans, solution.longestMountain(A));
    }

    @Test
    void longestMountain2() {
        int[] A = {2, 2, 2};
        int ans = 0;
        assertEquals(ans, solution.longestMountain(A));
    }
}