package com.zjxjwxk.leetcode._0134_Gas_Station;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canCompleteCircuit1() {
        int[] gas = {1, 2, 3, 4, 5}, cost = {3, 4, 5, 1, 2};
        int ans = 3, result = solution.canCompleteCircuit(gas, cost);
        assertEquals(ans, result);
    }

    @Test
    void canCompleteCircuit2() {
        int[] gas = {2, 3, 4}, cost = {3, 4, 3};
        int ans = -1, result = solution.canCompleteCircuit(gas, cost);
        assertEquals(ans, result);
    }
}