package com.zjxjwxk.leetcode._0274_H_Index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void hIndex1() {
        int[] citations = {3, 0, 6, 1, 5};
        int ans = 3;
        assertEquals(ans, solution.hIndex(citations));
    }

    @Test
    void hIndex2() {
        int[] citations = {1};
        int ans = 1;
        assertEquals(ans, solution.hIndex(citations));
    }
}