package com.zjxjwxk.leetcode._0598_Range_Addition_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxCount() {
        int m = 3, n = 3;
        int[][] ops = {{2, 2}, {3, 3}};
        int ans = 4;
        assertEquals(ans, solution.maxCount(m, n, ops));
    }
}