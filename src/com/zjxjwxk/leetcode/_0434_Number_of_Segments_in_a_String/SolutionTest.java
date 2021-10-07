package com.zjxjwxk.leetcode._0434_Number_of_Segments_in_a_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countSegments1() {
        String s = "Hello, my name is John";
        int ans = 5;
        assertEquals(ans, solution.countSegments(s));
    }

    @Test
    void countSegments2() {
        String s = "";
        int ans = 0;
        assertEquals(ans, solution.countSegments(s));
    }
}