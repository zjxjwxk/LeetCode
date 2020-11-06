package com.zjxjwxk.leetcode._1356_Sort_Integers_by_The_Number_of_1_Bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void sortByBits() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] ans = {0, 1, 2, 4, 8, 3, 5, 6, 7};
        assertArrayEquals(ans, solution2.sortByBits(arr));
        arr = new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        ans = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        assertArrayEquals(ans, solution2.sortByBits(arr));
        arr = new int[]{10000, 10000};
        ans = new int[]{10000, 10000};
        assertArrayEquals(ans, solution2.sortByBits(arr));
        arr = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        ans = new int[]{2, 3, 5, 17, 7, 11, 13, 19};
        assertArrayEquals(ans, solution2.sortByBits(arr));
        arr = new int[]{10, 100, 1000, 10000};
        ans = new int[]{10, 100, 10000, 1000};
        assertArrayEquals(ans, solution2.sortByBits(arr));
    }
}