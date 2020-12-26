package com.zjxjwxk.leetcode._0085_Maximal_Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void maximalRectangle1() {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        int ans = 6;
        assertEquals(ans, solution3.maximalRectangle(matrix));
    }

    @Test
    void maximalRectangle2() {
        char[][] matrix = {
                {'1'}
        };
        int ans = 1;
        assertEquals(ans, solution3.maximalRectangle(matrix));
    }
}