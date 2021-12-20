package com.zjxjwxk.leetcode._0475_Heaters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findRadius1() {
        int[] houses = {1, 2, 3};
        int[] heaters = {2};
        int ans = 1;
        assertEquals(ans, solution.findRadius(houses, heaters));
    }

    @Test
    void findRadius2() {
        int[] houses = {1, 2, 3, 4};
        int[] heaters = {1, 4};
        int ans = 1;
        assertEquals(ans, solution.findRadius(houses, heaters));
    }

    @Test
    void findRadius3() {
        int[] houses = {1, 5};
        int[] heaters = {2};
        int ans = 3;
        assertEquals(ans, solution.findRadius(houses, heaters));
    }
}