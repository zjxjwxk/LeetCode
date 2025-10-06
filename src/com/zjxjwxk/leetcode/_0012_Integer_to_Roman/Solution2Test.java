package com.zjxjwxk.leetcode._0012_Integer_to_Roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void intToRoman1() {
        int num = 3;
        String ans = "III";
        assertEquals(ans, solution2.intToRoman(num));
    }

    @Test
    void intToRoman2() {
        int num = 4;
        String ans = "IV";
        assertEquals(ans, solution2.intToRoman(num));
    }

    @Test
    void intToRoman3() {
        int num = 9;
        String ans = "IX";
        assertEquals(ans, solution2.intToRoman(num));
    }

    @Test
    void intToRoman4() {
        int num = 58;
        String ans = "LVIII";
        assertEquals(ans, solution2.intToRoman(num));
    }

    @Test
    void intToRoman5() {
        int num = 1994;
        String ans = "MCMXCIV";
        assertEquals(ans, solution2.intToRoman(num));
    }

}