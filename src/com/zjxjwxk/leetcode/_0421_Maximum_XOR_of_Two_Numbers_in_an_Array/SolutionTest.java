package com.zjxjwxk.leetcode._0421_Maximum_XOR_of_Two_Numbers_in_an_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMaximumXOR1() {
        int[] nums = {3, 10, 5, 25, 2, 8};
        int ans = 28;
        assertEquals(ans, solution.findMaximumXOR(nums));
    }

    @Test
    void findMaximumXOR2() {
        int[] nums = {0};
        int ans = 0;
        assertEquals(ans, solution.findMaximumXOR(nums));
    }

    @Test
    void findMaximumXOR3() {
        int[] nums = {2, 4};
        int ans = 6;
        assertEquals(ans, solution.findMaximumXOR(nums));
    }

    @Test
    void findMaximumXOR4() {
        int[] nums = {8, 10, 2};
        int ans = 10;
        assertEquals(ans, solution.findMaximumXOR(nums));
    }

    @Test
    void findMaximumXOR5() {
        int[] nums = {14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70};
        int ans = 127;
        assertEquals(ans, solution.findMaximumXOR(nums));
    }
}