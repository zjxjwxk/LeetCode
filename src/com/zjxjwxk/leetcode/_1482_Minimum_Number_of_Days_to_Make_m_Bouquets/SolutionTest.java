package com.zjxjwxk.leetcode._1482_Minimum_Number_of_Days_to_Make_m_Bouquets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minDays1() {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        int ans = 3;
        assertEquals(ans, solution.minDays(bloomDay, m, k));
    }

    @Test
    void minDays2() {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 2;
        int ans = -1;
        assertEquals(ans, solution.minDays(bloomDay, m, k));
    }

    @Test
    void minDays3() {
        int[] bloomDay = {7, 7, 7, 7, 12, 7, 7};
        int m = 2;
        int k = 3;
        int ans = 12;
        assertEquals(ans, solution.minDays(bloomDay, m, k));
    }

    @Test
    void minDays4() {
        int[] bloomDay = {1000000000, 1000000000};
        int m = 1;
        int k = 1;
        int ans = 1000000000;
        assertEquals(ans, solution.minDays(bloomDay, m, k));
    }

    @Test
    void minDays5() {
        int[] bloomDay = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        int m = 4;
        int k = 2;
        int ans = 9;
        assertEquals(ans, solution.minDays(bloomDay, m, k));
    }
}