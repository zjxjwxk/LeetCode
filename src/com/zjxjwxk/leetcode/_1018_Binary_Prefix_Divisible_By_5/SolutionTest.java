package com.zjxjwxk.leetcode._1018_Binary_Prefix_Divisible_By_5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void prefixesDivBy51() {
        int[] A = {0, 1, 1};
        List<Boolean> ans = Arrays.asList(true, false, false);
        assertEquals(ans, solution.prefixesDivBy5(A));
    }

    @Test
    void prefixesDivBy52() {
        int[] A = {1, 1, 1};
        List<Boolean> ans = Arrays.asList(false, false, false);
        assertEquals(ans, solution.prefixesDivBy5(A));
    }

    @Test
    void prefixesDivBy53() {
        int[] A = {0, 1, 1, 1, 1, 1};
        List<Boolean> ans = Arrays.asList(true, false, false, false, true, false);
        assertEquals(ans, solution.prefixesDivBy5(A));
    }

    @Test
    void prefixesDivBy54() {
        int[] A = {1, 1, 1, 0, 1};
        List<Boolean> ans = Arrays.asList(false, false, false, false, false);
        assertEquals(ans, solution.prefixesDivBy5(A));
    }

    @Test
    void prefixesDivBy55() {
        int[] A = {1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1};
        List<Boolean> ans = Arrays.asList(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, true, true, true, false);
        assertEquals(ans, solution.prefixesDivBy5(A));
    }
}