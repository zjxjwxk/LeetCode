package com.zjxjwxk.leetcode._0006_Zigzag_Conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void convert() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String ans = "PAHNAPLSIIGYIR";
        assertEquals(ans, solution.convert(s, numRows));
    }

    @Test
    void convert2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String ans = "PINALSIGYAHRPI";
        assertEquals(ans, solution.convert(s, numRows));
    }
}