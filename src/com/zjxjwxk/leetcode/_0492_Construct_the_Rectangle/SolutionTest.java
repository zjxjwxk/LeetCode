package com.zjxjwxk.leetcode._0492_Construct_the_Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void constructRectangle1() {
        int area = 4;
        int[] ans = {2, 2};
        assertArrayEquals(ans, solution.constructRectangle(area));
    }

    @Test
    void constructRectangle2() {
        int area = 13;
        int[] ans = {13, 1};
        assertArrayEquals(ans, solution.constructRectangle(area));
    }
}