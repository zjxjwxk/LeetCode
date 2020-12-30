package com.zjxjwxk.leetcode._1046_Last_Stone_Weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lastStoneWeight() {
        int[] stones = {2, 7, 4, 1, 8, 1};
        int ans = 1;
        assertEquals(ans, solution.lastStoneWeight(stones));
    }
}