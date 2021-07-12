package com.zjxjwxk.leetcode._0275_H_Index_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void hIndex() {
        int[] citations = {0, 1, 3, 5, 6};
        int ans = 3;
        assertEquals(ans, solution.hIndex(citations));
    }
}