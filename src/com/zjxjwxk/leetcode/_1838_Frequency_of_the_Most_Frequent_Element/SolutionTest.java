package com.zjxjwxk.leetcode._1838_Frequency_of_the_Most_Frequent_Element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxFrequency1() {
        int[] nums = {1, 2, 4};
        int k = 5;
        int ans = 3;
        assertEquals(ans, solution.maxFrequency(nums, k));
    }

    @Test
    void maxFrequency2() {
        int[] nums = {1, 4, 8, 13};
        int k = 5;
        int ans = 2;
        assertEquals(ans, solution.maxFrequency(nums, k));
    }

    @Test
    void maxFrequency3() {
        int[] nums = {3, 9, 6};
        int k = 2;
        int ans = 1;
        assertEquals(ans, solution.maxFrequency(nums, k));
    }
}