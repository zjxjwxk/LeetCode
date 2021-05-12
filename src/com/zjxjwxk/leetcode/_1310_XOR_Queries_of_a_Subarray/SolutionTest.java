package com.zjxjwxk.leetcode._1310_XOR_Queries_of_a_Subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void xorQueries1() {
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {
                {0, 1}, {1, 2}, {0, 3}, {3, 3}
        };
        int[] ans = {2, 7, 14, 8};
        assertArrayEquals(ans, solution.xorQueries(arr, queries));
    }

    @Test
    void xorQueries2() {
        int[] arr = {4, 8, 2, 10};
        int[][] queries = {
                {2, 3}, {1, 3}, {0, 0}, {0, 3}
        };
        int[] ans = {8, 0, 4, 4};
        assertArrayEquals(ans, solution.xorQueries(arr, queries));
    }
}