package com.zjxjwxk.leetcode._0699_Falling_Squares;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void fallingSquares() {
        int[][] positions = {{1, 2}, {2, 3}, {6, 1}};
        List<Integer> ans = Arrays.asList(2, 5, 5);
        assertEquals(ans, solution.fallingSquares(positions));
    }

    @Test
    void fallingSquares2() {
        int[][] positions = {{100, 100}, {200, 100}};
        List<Integer> ans = Arrays.asList(100, 100);
        assertEquals(ans, solution.fallingSquares(positions));
    }

    @Test
    void fallingSquares3() {
        int[][] positions = {{3, 2}, {5, 3}, {3, 2}, {7, 4}};
        List<Integer> ans = Arrays.asList(2, 3, 4, 7);
        assertEquals(ans, solution.fallingSquares(positions));
    }
}