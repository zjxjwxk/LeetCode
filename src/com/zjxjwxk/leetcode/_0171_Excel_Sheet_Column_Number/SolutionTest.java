package com.zjxjwxk.leetcode._0171_Excel_Sheet_Column_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void titleToNumber1() {
        String columnTitle = "A";
        int ans = 1;
        assertEquals(ans, solution.titleToNumber(columnTitle));
    }

    @Test
    void titleToNumber2() {
        String columnTitle = "AB";
        int ans = 28;
        assertEquals(ans, solution.titleToNumber(columnTitle));
    }

    @Test
    void titleToNumber3() {
        String columnTitle = "ZY";
        int ans = 701;
        assertEquals(ans, solution.titleToNumber(columnTitle));
    }

    @Test
    void titleToNumber4() {
        String columnTitle = "FXSHRXW";
        int ans = 2147483647;
        assertEquals(ans, solution.titleToNumber(columnTitle));
    }
}