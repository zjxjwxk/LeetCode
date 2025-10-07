package com.zjxjwxk.leetcode._1488_Avoid_Flood_in_The_City;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void avoidFlood() {
        int[] rains = {1, 2, 3, 4};
        int[] ans = {-1, -1, -1, -1};
        assertArrayEquals(ans, solution.avoidFlood(rains));
    }

    @Test
    void avoidFlood2() {
        int[] rains = {1, 2, 0, 0, 2, 1};
        int[] ans = {-1, -1, 2, 1, -1, -1};
        assertArrayEquals(ans, solution.avoidFlood(rains));
    }

    @Test
    void avoidFlood3() {
        int[] rains = {1, 2, 0, 1, 2};
        int[] ans = {};
        assertArrayEquals(ans, solution.avoidFlood(rains));
    }
}