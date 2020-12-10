package com.zjxjwxk.leetcode._0860_Lemonade_Change;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lemonadeChange1() {
        int[] bills = {5, 5, 5, 10, 20};
        assertTrue(solution.lemonadeChange(bills));
    }

    @Test
    void lemonadeChange2() {
        int[] bills = {5, 5, 10};
        assertTrue(solution.lemonadeChange(bills));
    }

    @Test
    void lemonadeChange3() {
        int[] bills = {10, 10};
        assertFalse(solution.lemonadeChange(bills));
    }

    @Test
    void lemonadeChange4() {
        int[] bills = {5, 5, 10, 10, 20};
        assertFalse(solution.lemonadeChange(bills));
    }

    @Test
    void lemonadeChange5() {
        int[] bills = {5, 5, 5, 5, 20, 20, 5, 5, 20, 5};
        assertFalse(solution.lemonadeChange(bills));
    }
}