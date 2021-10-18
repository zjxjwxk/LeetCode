package com.zjxjwxk.leetcode._0476_Number_Complement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findComplement1() {
        int num = 5;
        int ans = 2;
        assertEquals(ans, solution.findComplement(num));
    }

    @Test
    void findComplement2() {
        int num = 1;
        int ans = 0;
        assertEquals(ans, solution.findComplement(num));
    }
}