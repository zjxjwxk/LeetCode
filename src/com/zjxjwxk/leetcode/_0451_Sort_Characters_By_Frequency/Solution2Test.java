package com.zjxjwxk.leetcode._0451_Sort_Characters_By_Frequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void frequencySort1() {
        String s = "tree";
        String ans = "eert";
        assertEquals(ans, solution2.frequencySort(s));
    }

    @Test
    void frequencySort2() {
        String s = "cccaaa";
        String ans = "aaaccc";
        assertEquals(ans, solution2.frequencySort(s));
    }

    @Test
    void frequencySort3() {
        String s = "Aabb";
        String ans = "bbAa";
        assertEquals(ans, solution2.frequencySort(s));
    }
}