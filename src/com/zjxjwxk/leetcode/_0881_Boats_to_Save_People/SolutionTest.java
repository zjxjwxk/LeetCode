package com.zjxjwxk.leetcode._0881_Boats_to_Save_People;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numRescueBoats1() {
        int[] people = {1, 2};
        int limit = 3;
        int ans = 1;
        assertEquals(ans, solution.numRescueBoats(people, limit));
    }

    @Test
    void numRescueBoats2() {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        int ans = 3;
        assertEquals(ans, solution.numRescueBoats(people, limit));
    }

    @Test
    void numRescueBoats3() {
        int[] people = {3, 5, 3, 4};
        int limit = 5;
        int ans = 4;
        assertEquals(ans, solution.numRescueBoats(people, limit));
    }
}