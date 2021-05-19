package com.zjxjwxk.leetcode._1738_Find_Kth_Largest_XOR_Coordinate_Value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void kthLargestValue1() {
        int[][] matrix = {
                {5, 2}, {1, 6}
        };
        int k = 1;
        int ans = 7;
        assertEquals(ans, solution2.kthLargestValue(matrix, k));
    }

    @Test
    void kthLargestValue2() {
        int[][] matrix = {
                {5, 2}, {1, 6}
        };
        int k = 2;
        int ans = 5;
        assertEquals(ans, solution2.kthLargestValue(matrix, k));
    }

    @Test
    void kthLargestValue3() {
        int[][] matrix = {
                {5, 2}, {1, 6}
        };
        int k = 3;
        int ans = 4;
        assertEquals(ans, solution2.kthLargestValue(matrix, k));
    }

    @Test
    void kthLargestValue4() {
        int[][] matrix = {
                {5, 2}, {1, 6}
        };
        int k = 4;
        int ans = 0;
        assertEquals(ans, solution2.kthLargestValue(matrix, k));
    }
}