package com.zjxjwxk.leetcode._0006_Zigzag_Conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void convert() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String ans = "PAHNAPLSIIGYIR";
        assertEquals(ans, solution2.convert(s, numRows));
    }

    @Test
    void convert2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String ans = "PINALSIGYAHRPI";
        assertEquals(ans, solution2.convert(s, numRows));
    }
}