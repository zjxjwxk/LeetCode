package com.zjxjwxk.leetcode._0013_Roman_to_Integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void romanToInt1() {
        String s = "III";
        int ans = 3;
        assertEquals(ans, solution.romanToInt(s));
    }

    @Test
    void romanToInt2() {
        String s = "IV";
        int ans = 4;
        assertEquals(ans, solution.romanToInt(s));
    }

    @Test
    void romanToInt3() {
        String s = "IX";
        int ans = 9;
        assertEquals(ans, solution.romanToInt(s));
    }

    @Test
    void romanToInt4() {
        String s = "LVIII";
        int ans = 58;
        assertEquals(ans, solution.romanToInt(s));
    }

    @Test
    void romanToInt5() {
        String s = "MCMXCIV";
        int ans = 1994;
        assertEquals(ans, solution.romanToInt(s));
    }
}