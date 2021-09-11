package com.zjxjwxk.leetcode._0600_Non_negative_Integers_without_Consecutive_Ones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findIntegers() {
        int n = 5;
        int ans = 5;
        assertEquals(ans, solution.findIntegers(n));
    }
}