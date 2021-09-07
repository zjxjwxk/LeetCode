package com.zjxjwxk.leetcode._1221_Split_a_String_in_Balanced_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void balancedStringSplit1() {
        String s = "RLRRLLRLRL";
        int ans = 4;
        assertEquals(ans, solution.balancedStringSplit(s));
    }

    @Test
    void balancedStringSplit2() {
        String s = "RLLLLRRRLR";
        int ans = 3;
        assertEquals(ans, solution.balancedStringSplit(s));
    }

    @Test
    void balancedStringSplit3() {
        String s = "LLLLRRRR";
        int ans = 1;
        assertEquals(ans, solution.balancedStringSplit(s));
    }

    @Test
    void balancedStringSplit4() {
        String s = "RLRRRLLRLL";
        int ans = 2;
        assertEquals(ans, solution.balancedStringSplit(s));
    }
}