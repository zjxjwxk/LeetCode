package com.zjxjwxk.leetcode._1846_Maximum_Element_After_Decreasing_and_Rearranging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumElementAfterDecrementingAndRearranging1() {
        int[] arr = {2, 2, 1, 2, 1};
        int ans = 2;
        assertEquals(ans, solution.maximumElementAfterDecrementingAndRearranging(arr));
    }

    @Test
    void maximumElementAfterDecrementingAndRearranging2() {
        int[] arr = {100, 1, 1000};
        int ans = 3;
        assertEquals(ans, solution.maximumElementAfterDecrementingAndRearranging(arr));
    }

    @Test
    void maximumElementAfterDecrementingAndRearranging3() {
        int[] arr = {1, 2, 3, 4, 5};
        int ans = 5;
        assertEquals(ans, solution.maximumElementAfterDecrementingAndRearranging(arr));
    }

    @Test
    void maximumElementAfterDecrementingAndRearranging4() {
        int[] arr = {3, 4, 5, 6};
        int ans = 4;
        assertEquals(ans, solution.maximumElementAfterDecrementingAndRearranging(arr));
    }
}