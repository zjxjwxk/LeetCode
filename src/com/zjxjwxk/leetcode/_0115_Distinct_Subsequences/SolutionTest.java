package com.zjxjwxk.leetcode._0115_Distinct_Subsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numDistinct1() {
        String s = "rabbbit";
        String t = "rabbit";
        int ans = 3;
        assertEquals(ans, solution.numDistinct(s, t));
    }

    @Test
    void numDistinct2() {
        String s = "babgbag";
        String t = "bag";
        int ans = 5;
        assertEquals(ans, solution.numDistinct(s, t));
    }
}