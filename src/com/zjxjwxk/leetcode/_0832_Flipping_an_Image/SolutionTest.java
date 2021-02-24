package com.zjxjwxk.leetcode._0832_Flipping_an_Image;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void flipAndInvertImage1() {
        int[][] A = {
                {1, 1, 0}, {1, 0, 1}, {0, 0, 0}
        };
        int[][] ans = {
                {1, 0, 0}, {0, 1, 0}, {1, 1, 1}
        };
        assertArrayEquals(ans, solution.flipAndInvertImage(A));
    }

    @Test
    void flipAndInvertImage2() {
        int[][] A = {
                {1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}
        };
        int[][] ans = {
                {1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}
        };
        assertArrayEquals(ans, solution.flipAndInvertImage(A));
    }
}