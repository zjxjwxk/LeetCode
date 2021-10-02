package com.zjxjwxk.leetcode._0405_Convert_a_Number_to_Hexadecimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void toHex1() {
        int num = 26;
        String ans = "1a";
        assertEquals(ans, solution.toHex(num));
    }

    @Test
    void toHex2() {
        int num = -1;
        String ans = "ffffffff";
        assertEquals(ans, solution.toHex(num));
    }
}