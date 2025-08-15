package com.zjxjwxk.leetcode._0295_Find_Median_from_Data_Stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {

    @Test
    void test() {
        MedianFinder medianFinder = new MedianFinder();
        int[] nums = new int[]{1, 2, 3};
        double[] actul = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            medianFinder.addNum(nums[i]);
            actul[i] = medianFinder.findMedian();
        }
        double[] ans = new double[]{1, 1.5, 2};
        assertArrayEquals(ans, actul);
    }

    @Test
    void test2() {
        MedianFinder medianFinder = new MedianFinder();
        int[] nums = new int[]{6, 10, 2, 6, 5, 0, 6, 3, 1, 0, 0};
        double[] actul = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            medianFinder.addNum(nums[i]);
            actul[i] = medianFinder.findMedian();
        }
        double[] ans = new double[]{6, 8, 6, 6, 6, 5.5, 6, 5.5, 5, 4, 3};
        assertArrayEquals(ans, actul);
    }
}