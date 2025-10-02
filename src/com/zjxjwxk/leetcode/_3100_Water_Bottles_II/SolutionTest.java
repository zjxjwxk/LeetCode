package com.zjxjwxk.leetcode._3100_Water_Bottles_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxBottlesDrunk() {
        int numBottles = 13, numExchange = 6;
        int ans = 15;
        assertEquals(ans, solution.maxBottlesDrunk(numBottles, numExchange));
    }

    @Test
    void maxBottlesDrunk2() {
        int numBottles = 10, numExchange = 3;
        int ans = 13;
        assertEquals(ans, solution.maxBottlesDrunk(numBottles, numExchange));
    }
}