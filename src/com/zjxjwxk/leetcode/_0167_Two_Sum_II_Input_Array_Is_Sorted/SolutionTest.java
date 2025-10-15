package com.zjxjwxk.leetcode._0167_Two_Sum_II_Input_Array_Is_Sorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void twoSum() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] ans = {1, 2};
        assertArrayEquals(ans, solution.twoSum(numbers, target));
    }

    @Test
    void twoSum2() {
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] ans = {1, 3};
        assertArrayEquals(ans, solution.twoSum(numbers, target));
    }

    @Test
    void twoSum3() {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] ans = {1, 2};
        assertArrayEquals(ans, solution.twoSum(numbers, target));
    }
}