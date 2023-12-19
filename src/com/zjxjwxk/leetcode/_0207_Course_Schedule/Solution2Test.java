package com.zjxjwxk.leetcode._0207_Course_Schedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void canFinish1() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        assertTrue(solution2.canFinish(numCourses, prerequisites));
    }

    @Test
    void canFinish2() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        assertFalse(solution2.canFinish(numCourses, prerequisites));
    }

    @Test
    void canFinish3() {
        int numCourses = 5;
        int[][] prerequisites = {{1, 4}, {2, 4}, {3, 1}, {3, 2}};
        assertTrue(solution2.canFinish(numCourses, prerequisites));
    }
}