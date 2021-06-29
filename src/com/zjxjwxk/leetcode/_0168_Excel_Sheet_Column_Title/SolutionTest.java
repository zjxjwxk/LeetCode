package com.zjxjwxk.leetcode._0168_Excel_Sheet_Column_Title;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void convertToTitle1() {
        int columnNumber = 1;
        String ans = "A";
        assertEquals(ans, solution.convertToTitle(columnNumber));
    }

    @Test
    void convertToTitle2() {
        int columnNumber = 28;
        String ans = "AB";
        assertEquals(ans, solution.convertToTitle(columnNumber));
    }

    @Test
    void convertToTitle3() {
        int columnNumber = 701;
        String ans = "ZY";
        assertEquals(ans, solution.convertToTitle(columnNumber));
    }

    @Test
    void convertToTitle4() {
        int columnNumber = 2147483647;
        String ans = "FXSHRXW";
        assertEquals(ans, solution.convertToTitle(columnNumber));
    }
}