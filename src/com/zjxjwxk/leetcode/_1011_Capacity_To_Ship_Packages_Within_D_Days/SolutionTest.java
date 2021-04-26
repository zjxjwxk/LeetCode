package com.zjxjwxk.leetcode._1011_Capacity_To_Ship_Packages_Within_D_Days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void shipWithinDays1() {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int D = 5;
        int ans = 15;
        assertEquals(ans, solution.shipWithinDays(weights, D));
    }

    @Test
    void shipWithinDays2() {
        int[] weights = {3, 2, 2, 4, 1, 4};
        int D = 3;
        int ans = 6;
        assertEquals(ans, solution.shipWithinDays(weights, D));
    }

    @Test
    void shipWithinDays3() {
        int[] weights = {1, 2, 3, 1, 1};
        int D = 4;
        int ans = 3;
        assertEquals(ans, solution.shipWithinDays(weights, D));
    }
}