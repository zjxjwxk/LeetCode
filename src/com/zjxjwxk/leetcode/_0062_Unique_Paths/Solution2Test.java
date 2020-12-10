package com.zjxjwxk.leetcode._0062_Unique_Paths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void uniquePaths1() {
        int m = 3, n = 7;
        int ans = 28;
        assertEquals(ans, solution2.uniquePaths(m, n));
    }

    @Test
    void uniquePaths2() {
        int m = 3, n = 2;
        int ans = 3;
        assertEquals(ans, solution2.uniquePaths(m, n));
    }

    @Test
    void uniquePaths3() {
        int m = 7, n = 3;
        int ans = 28;
        assertEquals(ans, solution2.uniquePaths(m, n));
    }

    @Test
    void uniquePaths4() {
        int m = 3, n = 3;
        int ans = 6;
        assertEquals(ans, solution2.uniquePaths(m, n));
    }

    @Test
    void uniquePaths5() {
        int m = 19, n = 13;
        int ans = 86493225;
        assertEquals(ans, solution2.uniquePaths(m, n));
    }
}