package com.zjxjwxk.leetcode._0743_Network_Delay_Time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void networkDelayTime1() {
        int[][] times = {
                {2, 1, 1}, {2, 3, 1}, {3, 4, 1}
        };
        int n = 4, k = 2;
        int ans = 2;
        assertEquals(ans, solution.networkDelayTime(times, n, k));
    }

    @Test
    void networkDelayTime2() {
        int[][] times = {
                {1, 2, 1}
        };
        int n = 2, k = 1;
        int ans = 1;
        assertEquals(ans, solution.networkDelayTime(times, n, k));
    }

    @Test
    void networkDelayTime3() {
        int[][] times = {
                {1, 2, 1}
        };
        int n = 2, k = 2;
        int ans = -1;
        assertEquals(ans, solution.networkDelayTime(times, n, k));
    }
}