package com.zjxjwxk.leetcode._0038_Count_and_Say;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countAndSay1() {
        int n = 1;
        String ans = "1";
        assertEquals(ans, solution.countAndSay(n));
    }

    @Test
    void countAndSay2() {
        int n = 4;
        String ans = "1211";
        assertEquals(ans, solution.countAndSay(n));
    }
}