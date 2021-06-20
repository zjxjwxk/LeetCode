package com.zjxjwxk.leetcode._0483_Smallest_Good_Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void smallestGoodBase1() {
        String n = "13";
        String ans = "3";
        assertEquals(ans, solution.smallestGoodBase(n));
    }

    @Test
    void smallestGoodBase2() {
        String n = "4681";
        String ans = "8";
        assertEquals(ans, solution.smallestGoodBase(n));
    }

    @Test
    void smallestGoodBase3() {
        String n = "1000000000000000000";
        String ans = "999999999999999999";
        assertEquals(ans, solution.smallestGoodBase(n));
    }

    @Test
    void smallestGoodBase4() {
        String n = "2251799813685247";
        String ans = "2";
        assertEquals(ans, solution.smallestGoodBase(n));
    }
}