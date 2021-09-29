package com.zjxjwxk.leetcode._0517_Super_Washing_Machines;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMinMoves1() {
        int[] machines = {1, 0, 5};
        int ans = 3;
        assertEquals(ans, solution.findMinMoves(machines));
    }

    @Test
    void findMinMoves2() {
        int[] machines = {0, 3, 0};
        int ans = 2;
        assertEquals(ans, solution.findMinMoves(machines));
    }

    @Test
    void findMinMoves3() {
        int[] machines = {0, 2, 0};
        int ans = -1;
        assertEquals(ans, solution.findMinMoves(machines));
    }
}