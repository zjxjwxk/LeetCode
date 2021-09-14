package com.zjxjwxk.leetcode._0787_Cheapest_Flights_Within_K_Stops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findCheapestPrice1() {
        int n = 3;
        int[][] edges = {
                {0, 1, 100}, {1, 2, 100}, {0, 2, 500}
        };
        int src = 0, dst = 2, k = 1;
        int ans = 200;
        assertEquals(ans, solution.findCheapestPrice(n ,edges, src, dst, k));
    }

    @Test
    void findCheapestPrice2() {
        int n = 3;
        int[][] edges = {
                {0, 1, 100}, {1, 2, 100}, {0, 2, 500}
        };
        int src = 0, dst = 2, k = 0;
        int ans = 500;
        assertEquals(ans, solution.findCheapestPrice(n ,edges, src, dst, k));
    }

    @Test
    void findCheapestPrice3() {
        int n = 3;
        int[][] edges = {
                {0, 1, 2}, {1, 2, 1}, {2, 0, 10}
        };
        int src = 1, dst = 2, k = 1;
        int ans = 1;
        assertEquals(ans, solution.findCheapestPrice(n ,edges, src, dst, k));
    }
}