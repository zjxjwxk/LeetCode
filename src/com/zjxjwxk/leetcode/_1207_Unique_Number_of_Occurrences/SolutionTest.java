package com.zjxjwxk.leetcode._1207_Unique_Number_of_Occurrences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void uniqueOccurrences() {
        int[] arr = {1, 2, 2, 1, 1, 3};
        assertTrue(solution.uniqueOccurrences(arr));
    }
}