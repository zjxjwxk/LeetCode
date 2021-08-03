package com.zjxjwxk.leetcode._1743_Restore_the_Array_From_Adjacent_Pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void restoreArray1() {
        int[][] adjacentPairs = {
                {2, 1}, {3, 4}, {3, 2}
        };
        int[] ans = {1, 2, 3, 4};
        assertArrayEquals(ans, solution.restoreArray(adjacentPairs));
    }

    @Test
    void restoreArray2() {
        int[][] adjacentPairs = {
                {4, -2}, {1, 4}, {-3, 1}
        };
        int[] ans = {-2, 4, 1, -3};
        assertArrayEquals(ans, solution.restoreArray(adjacentPairs));
    }

    @Test
    void restoreArray3() {
        int[][] adjacentPairs = {
                {100000, -100000}
        };
        int[] ans = {100000, -100000};
        assertArrayEquals(ans, solution.restoreArray(adjacentPairs));
    }
}