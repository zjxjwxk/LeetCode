package com.zjxjwxk.leetcode._0221_Maximal_Square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximalSquare() {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}
        };
        int ans = 4;
        assertEquals(ans, solution.maximalSquare(matrix));
    }

    @Test
    void maximalSquare2() {
        char[][] matrix = {
                {'0', '1'}, {'1', '0'}
        };
        int ans = 1;
        assertEquals(ans, solution.maximalSquare(matrix));
    }

    @Test
    void maximalSquare3() {
        char[][] matrix = {
                {'0'}
        };
        int ans = 0;
        assertEquals(ans, solution.maximalSquare(matrix));
    }
}