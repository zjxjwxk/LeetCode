package com.zjxjwxk.leetcode._1518_Water_Bottles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numWaterBottles1() {
        int numBottles = 9, numExchange = 3;
        int ans = 13;
        assertEquals(ans, solution.numWaterBottles(numBottles, numExchange));
    }

    @Test
    void numWaterBottles2() {
        int numBottles = 15, numExchange = 4;
        int ans = 19;
        assertEquals(ans, solution.numWaterBottles(numBottles, numExchange));
    }

    @Test
    void numWaterBottles3() {
        int numBottles = 5, numExchange = 5;
        int ans = 6;
        assertEquals(ans, solution.numWaterBottles(numBottles, numExchange));
    }

    @Test
    void numWaterBottles4() {
        int numBottles = 2, numExchange = 3;
        int ans = 2;
        assertEquals(ans, solution.numWaterBottles(numBottles, numExchange));
    }
}