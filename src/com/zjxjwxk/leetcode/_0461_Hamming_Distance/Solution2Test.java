package com.zjxjwxk.leetcode._0461_Hamming_Distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void hammingDistance() {
        int x = 1, y = 4;
        int ans = 2;
        assertEquals(ans, solution2.hammingDistance(x, y));
    }
}