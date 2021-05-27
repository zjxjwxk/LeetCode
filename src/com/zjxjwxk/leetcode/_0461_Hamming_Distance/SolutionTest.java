package com.zjxjwxk.leetcode._0461_Hamming_Distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void hammingDistance() {
        int x = 1, y = 4;
        int ans = 2;
        assertEquals(ans, solution.hammingDistance(x, y));
    }
}