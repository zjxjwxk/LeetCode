package com.zjxjwxk.leetcode._0210_Course_Schedule_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findOrder1() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        int[] ans = {0, 1};
        assertArrayEquals(ans, solution.findOrder(numCourses, prerequisites));
    }

    @Test
    void findOrder2() {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] ans = {0, 1, 2, 3};
        assertArrayEquals(ans, solution.findOrder(numCourses, prerequisites));
    }

    @Test
    void findOrder3() {
        int numCourses = 1;
        int[][] prerequisites = {};
        int[] ans = {0};
        assertArrayEquals(ans, solution.findOrder(numCourses, prerequisites));
    }
}