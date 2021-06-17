package com.zjxjwxk.leetcode._0852_Peak_Index_in_a_Mountain_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void peakIndexInMountainArray1() {
        int[] arr = {0, 1, 0};
        int ans = 1;
        assertEquals(ans, solution.peakIndexInMountainArray(arr));
    }

    @Test
    void peakIndexInMountainArray2() {
        int[] arr = {0, 2, 1, 0};
        int ans = 1;
        assertEquals(ans, solution.peakIndexInMountainArray(arr));
    }

    @Test
    void peakIndexInMountainArray3() {
        int[] arr = {0, 10, 5, 2};
        int ans = 1;
        assertEquals(ans, solution.peakIndexInMountainArray(arr));
    }

    @Test
    void peakIndexInMountainArray4() {
        int[] arr = {3, 4, 5, 1};
        int ans = 2;
        assertEquals(ans, solution.peakIndexInMountainArray(arr));
    }

    @Test
    void peakIndexInMountainArray5() {
        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        int ans = 2;
        assertEquals(ans, solution.peakIndexInMountainArray(arr));
    }
}