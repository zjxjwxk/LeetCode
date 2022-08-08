package com.zjxjwxk.leetcode._0967_Numbers_With_Same_Consecutive_Differences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zjxjwxk
 * @date 2022/8/8 22:00
 */
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numsSameConsecDiff1() {
        int n = 3, k = 7;
        int[] ans = new int[]{181, 292, 707, 818, 929};
        assertArrayEquals(ans, solution.numsSameConsecDiff(n, k));
    }

    @Test
    void numsSameConsecDiff2() {
        int n = 2, k = 1;
        int[] ans = new int[]{10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98};
        assertArrayEquals(ans, solution.numsSameConsecDiff(n, k));
    }

    @Test
    void numsSameConsecDiff3() {
        int n = 2, k = 0;
        int[] ans = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        assertArrayEquals(ans, solution.numsSameConsecDiff(n, k));
    }

    @Test
    void numsSameConsecDiff4() {
        int n = 2, k = 2;
        int[] ans = new int[]{13, 20, 24, 31, 35, 42, 46, 53, 57, 64, 68, 75, 79, 86, 97};
        assertArrayEquals(ans, solution.numsSameConsecDiff(n, k));
    }
}