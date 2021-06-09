package com.zjxjwxk.leetcode._1049_Last_Stone_Weight_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lastStoneWeightII1() {
        int[] stones = {2, 7, 4, 1, 8, 1};
        int ans = 1;
        assertEquals(ans, solution.lastStoneWeightII(stones));
    }

    @Test
    void lastStoneWeightII2() {
        int[] stones = {31, 26, 33, 21, 40};
        int ans = 5;
        assertEquals(ans, solution.lastStoneWeightII(stones));
    }

    @Test
    void lastStoneWeightII3() {
        int[] stones = {1, 2};
        int ans = 1;
        assertEquals(ans, solution.lastStoneWeightII(stones));
    }
}