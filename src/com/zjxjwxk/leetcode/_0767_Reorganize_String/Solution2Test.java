package com.zjxjwxk.leetcode._0767_Reorganize_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void reorganizeString1() {
        String S = "aab";
        String ans = "aba";
        assertEquals(ans, solution2.reorganizeString(S));
    }

    @Test
    void reorganizeString2() {
        String S = "aaab";
        String ans = "";
        assertEquals(ans, solution2.reorganizeString(S));
    }

    @Test
    void reorganizeString3() {
        String S = "vvvlo";
        String ans = "vlvov";
        assertEquals(ans, solution2.reorganizeString(S));
    }

    @Test
    void reorganizeString4() {
        String S = "bfrbs";
        String ans = "fbrbs";
        assertEquals(ans, solution2.reorganizeString(S));
    }

    @Test
    void reorganizeString5() {
        String S = "abbabbaaab";
        String ans = "bababababa";
        assertEquals(ans, solution2.reorganizeString(S));
    }
}