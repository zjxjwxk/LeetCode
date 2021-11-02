package com.zjxjwxk.leetcode._0335_Self_Crossing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isSelfCrossing1() {
        int[] distance = {2, 1, 1, 2};
        assertTrue(solution.isSelfCrossing(distance));
    }

    @Test
    void isSelfCrossing2() {
        int[] distance = {1, 2, 3, 4};
        assertFalse(solution.isSelfCrossing(distance));
    }

    @Test
    void isSelfCrossing3() {
        int[] distance = {1, 1, 1, 1};
        assertTrue(solution.isSelfCrossing(distance));
    }
}