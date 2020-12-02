package com.zjxjwxk.leetcode._0767_Reorganize_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reorganizeString1() {
        String S = "aab";
        String ans = "aba";
        assertEquals(ans, solution.reorganizeString(S));
    }

    @Test
    void reorganizeString2() {
        String S = "aaab";
        String ans = "";
        assertEquals(ans, solution.reorganizeString(S));
    }

    @Test
    void reorganizeString3() {
        String S = "vvvlo";
        String ans = "vlvov";
        assertEquals(ans, solution.reorganizeString(S));
    }

    @Test
    void reorganizeString4() {
        String S = "bfrbs";
        String ans = "bsrbf";
        assertEquals(ans, solution.reorganizeString(S));
    }
}