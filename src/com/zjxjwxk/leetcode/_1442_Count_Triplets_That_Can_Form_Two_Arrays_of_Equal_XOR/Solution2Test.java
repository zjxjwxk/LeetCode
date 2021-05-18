package com.zjxjwxk.leetcode._1442_Count_Triplets_That_Can_Form_Two_Arrays_of_Equal_XOR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void countTriplets1() {
        int[] arr = {2, 3, 1, 6, 7};
        int ans = 4;
        assertEquals(ans, solution2.countTriplets(arr));
    }

    @Test
    void countTriplets2() {
        int[] arr = {1, 1, 1, 1, 1};
        int ans = 10;
        assertEquals(ans, solution2.countTriplets(arr));
    }

    @Test
    void countTriplets3() {
        int[] arr = {2, 3};
        int ans = 0;
        assertEquals(ans, solution2.countTriplets(arr));
    }

    @Test
    void countTriplets4() {
        int[] arr = {1, 3, 5, 7, 9};
        int ans = 3;
        assertEquals(ans, solution2.countTriplets(arr));
    }

    @Test
    void countTriplets5() {
        int[] arr = {7, 11, 12, 9, 5, 2, 7, 17, 22};
        int ans = 8;
        assertEquals(ans, solution2.countTriplets(arr));
    }
}