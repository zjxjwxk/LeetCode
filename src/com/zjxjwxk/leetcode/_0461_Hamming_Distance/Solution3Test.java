package com.zjxjwxk.leetcode._0461_Hamming_Distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    private final Solution3 solution3 = new Solution3();

    @Test
    void hammingDistance() {
        int x = 1, y = 4;
        int ans = 2;
        assertEquals(ans, solution3.hammingDistance(x, y));
    }
}