package com.zjxjwxk.leetcode._0495_Teemo_Attacking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findPoisonedDuration1() {
        int[] timeSeries = {1, 4};
        int duration = 2;
        int ans = 4;
        assertEquals(ans, solution.findPoisonedDuration(timeSeries, duration));
    }

    @Test
    void findPoisonedDuration2() {
        int[] timeSeries = {1, 2};
        int duration = 2;
        int ans = 3;
        assertEquals(ans, solution.findPoisonedDuration(timeSeries, duration));
    }
}