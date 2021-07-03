package com.zjxjwxk.leetcode._0451_Sort_Characters_By_Frequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void frequencySort1() {
        String s = "tree";
        String ans = "eert";
        assertEquals(ans, solution.frequencySort(s));
    }

    @Test
    void frequencySort2() {
        String s = "cccaaa";
        String ans = "aaaccc";
        assertEquals(ans, solution.frequencySort(s));
    }

    @Test
    void frequencySort3() {
        String s = "Aabb";
        String ans = "bbaA";
        assertEquals(ans, solution.frequencySort(s));
    }
}