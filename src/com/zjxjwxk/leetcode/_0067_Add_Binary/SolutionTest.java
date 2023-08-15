package com.zjxjwxk.leetcode._0067_Add_Binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void addBinary1() {
        String a = "11", b = "1";
        String ans = "100";
        assertEquals(ans, solution.addBinary(a, b));
    }

    @Test
    void addBinary2() {
        String a = "1010", b = "1011";
        String ans = "10101";
        assertEquals(ans, solution.addBinary(a, b));
    }
}