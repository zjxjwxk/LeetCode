package com.zjxjwxk.leetcode._0474_Ones_and_Zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMaxForm1() {
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        int ans = 4;
        assertEquals(ans, solution.findMaxForm(strs, m, n));
    }

    @Test
    void findMaxForm2() {
        String[] strs = {"10", "0", "1"};
        int m = 1;
        int n = 1;
        int ans = 2;
        assertEquals(ans, solution.findMaxForm(strs, m, n));
    }
}