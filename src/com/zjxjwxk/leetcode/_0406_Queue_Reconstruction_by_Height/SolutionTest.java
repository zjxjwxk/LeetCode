package com.zjxjwxk.leetcode._0406_Queue_Reconstruction_by_Height;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reconstructQueue1() {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] ans = {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
        assertArrayEquals(ans, solution.reconstructQueue(people));
    }

    @Test
    void reconstructQueue2() {
        int[][] people = {{9, 0}, {7, 0}, {1, 9}, {3, 0}, {2, 7}, {5, 3}, {6, 0}, {3, 4}, {6, 2}, {5, 2}};
        int[][] ans = {{3, 0}, {6, 0}, {7, 0}, {5, 2}, {3, 4}, {5, 3}, {6, 2}, {2, 7}, {9, 0}, {1, 9}};
        assertArrayEquals(ans, solution.reconstructQueue(people));
    }
}