package com.zjxjwxk.leetcode._0630_Course_Schedule_III;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void scheduleCourse1() {
        int[][] courses = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        int ans = 3;
        assertEquals(ans, solution.scheduleCourse(courses));
    }

    @Test
    void scheduleCourse2() {
        int[][] courses = {{1, 2}};
        int ans = 1;
        assertEquals(ans, solution.scheduleCourse(courses));
    }

    @Test
    void scheduleCourse3() {
        int[][] courses = {{3, 2}, {4, 3}};
        int ans = 0;
        assertEquals(ans, solution.scheduleCourse(courses));
    }

    @Test
    void scheduleCourse4() {
        int[][] courses = {{5, 5}, {4, 6}, {2, 6}};
        int ans = 2;
        assertEquals(ans, solution.scheduleCourse(courses));
    }
}