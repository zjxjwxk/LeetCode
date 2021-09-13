package com.zjxjwxk.leetcode._0447_Number_of_Boomerangs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfBoomerangs1() {
        int[][] points = {
                {0, 0}, {1, 0}, {2, 0}
        };
        int ans = 2;
        assertEquals(ans, solution.numberOfBoomerangs(points));
    }

    @Test
    void numberOfBoomerangs2() {
        int[][] points = {
                {1, 1}, {2, 2}, {3, 3}
        };
        int ans = 2;
        assertEquals(ans, solution.numberOfBoomerangs(points));
    }

    @Test
    void numberOfBoomerangs3() {
        int[][] points = {
                {1, 1}
        };
        int ans = 0;
        assertEquals(ans, solution.numberOfBoomerangs(points));
    }
}