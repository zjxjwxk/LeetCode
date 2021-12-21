package com.zjxjwxk.leetcode._1154_Day_of_the_Year;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void dayOfYear1() {
        String date = "2019-01-09";
        int ans = 9;
        assertEquals(ans, solution.dayOfYear(date));
    }

    @Test
    void dayOfYear2() {
        String date = "2019-02-10";
        int ans = 41;
        assertEquals(ans, solution.dayOfYear(date));
    }

    @Test
    void dayOfYear3() {
        String date = "2003-03-01";
        int ans = 60;
        assertEquals(ans, solution.dayOfYear(date));
    }

    @Test
    void dayOfYear4() {
        String date = "2004-03-01";
        int ans = 61;
        assertEquals(ans, solution.dayOfYear(date));
    }
}