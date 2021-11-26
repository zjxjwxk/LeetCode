package com.zjxjwxk.leetcode._0458_Poor_Pigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void poorPigs1() {
        int buckets = 1000, minutesToDie = 15, minutesToTest = 60;
        int ans = 5;
        assertEquals(ans, solution.poorPigs(buckets, minutesToDie, minutesToTest));
    }

    @Test
    void poorPigs2() {
        int buckets = 4, minutesToDie = 15, minutesToTest = 15;
        int ans = 2;
        assertEquals(ans, solution.poorPigs(buckets, minutesToDie, minutesToTest));
    }

    @Test
    void poorPigs3() {
        int buckets = 4, minutesToDie = 15, minutesToTest = 30;
        int ans = 2;
        assertEquals(ans, solution.poorPigs(buckets, minutesToDie, minutesToTest));
    }
}