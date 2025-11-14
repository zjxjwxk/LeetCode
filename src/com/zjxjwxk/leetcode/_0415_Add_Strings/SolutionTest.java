package com.zjxjwxk.leetcode._0415_Add_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void addStrings() {
        String num1 = "11", num2 = "123";
        String ans = "134";
        assertEquals(ans, solution.addStrings(num1, num2));
    }

    @Test
    void addStrings2() {
        String num1 = "456", num2 = "77";
        String ans = "533";
        assertEquals(ans, solution.addStrings(num1, num2));
    }

    @Test
    void addStrings3() {
        String num1 = "0", num2 = "0";
        String ans = "0";
        assertEquals(ans, solution.addStrings(num1, num2));
    }
}