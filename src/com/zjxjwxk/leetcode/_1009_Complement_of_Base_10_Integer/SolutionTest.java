package com.zjxjwxk.leetcode._1009_Complement_of_Base_10_Integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void bitwiseComplement1() {
        int n = 5;
        int ans = 2;
        assertEquals(ans, solution.bitwiseComplement(n));
    }

    @Test
    void bitwiseComplement2() {
        int n = 7;
        int ans = 0;
        assertEquals(ans, solution.bitwiseComplement(n));
    }

    @Test
    void bitwiseComplement3() {
        int n = 10;
        int ans = 5;
        assertEquals(ans, solution.bitwiseComplement(n));
    }

    @Test
    void bitwiseComplement4() {
        int n = 0;
        int ans = 1;
        assertEquals(ans, solution.bitwiseComplement(n));
    }
}