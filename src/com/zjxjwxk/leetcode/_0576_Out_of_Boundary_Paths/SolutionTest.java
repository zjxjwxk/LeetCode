package com.zjxjwxk.leetcode._0576_Out_of_Boundary_Paths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findPaths1() {
        int m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0;
        int ans = 6;
        assertEquals(ans, solution.findPaths(m, n, maxMove, startRow, startColumn));
    }

    @Test
    void findPaths2() {
        int m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1;
        int ans = 12;
        assertEquals(ans, solution.findPaths(m, n, maxMove, startRow, startColumn));
    }
}