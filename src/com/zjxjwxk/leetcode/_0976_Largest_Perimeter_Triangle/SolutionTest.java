package com.zjxjwxk.leetcode._0976_Largest_Perimeter_Triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void largestPerimeter1() {
        int[] A = {2, 1, 2};
        int ans = 5;
        assertEquals(ans, solution.largestPerimeter(A));
    }

    @Test
    void largestPerimeter2() {
        int[] A = {1, 2, 1};
        int ans = 0;
        assertEquals(ans, solution.largestPerimeter(A));
    }

    @Test
    void largestPerimeter3() {
        int[] A = {3, 2, 3, 4};
        int ans = 10;
        assertEquals(ans, solution.largestPerimeter(A));
    }

    @Test
    void largestPerimeter4() {
        int[] A = {3, 6, 2, 3};
        int ans = 8;
        assertEquals(ans, solution.largestPerimeter(A));
    }
}