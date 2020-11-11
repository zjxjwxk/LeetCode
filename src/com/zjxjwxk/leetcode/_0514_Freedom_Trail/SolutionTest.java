package com.zjxjwxk.leetcode._0514_Freedom_Trail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findRotateSteps1() {
        String ring = "godding", key = "gd";
        int ans = 4, result = solution.findRotateSteps(ring, key);
        assertEquals(ans, result);
    }

    @Test
    void findRotateSteps2() {
        String ring = "godding", key = "godding";
        int ans = 13, result = solution.findRotateSteps(ring, key);
        assertEquals(ans, result);
    }

    @Test
    void findRotateSteps3() {
        String ring = "abcde", key = "ade";
        int ans = 6, result = solution.findRotateSteps(ring, key);
        assertEquals(ans, result);
    }

    @Test
    void findRotateSteps4() {
        String ring = "pqwcx", key = "cpqwx";
        int ans = 13, result = solution.findRotateSteps(ring, key);
        assertEquals(ans, result);
    }

    @Test
    void findRotateSteps5() {
        String ring = "caotmcaataijjxi", key = "oatjiioicitatajtijciocjcaaxaaatmctxamacaamjjx";
        int ans = 137, result = solution.findRotateSteps(ring, key);
        assertEquals(ans, result);
    }
}