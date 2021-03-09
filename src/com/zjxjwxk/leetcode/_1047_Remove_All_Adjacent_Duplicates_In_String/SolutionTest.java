package com.zjxjwxk.leetcode._1047_Remove_All_Adjacent_Duplicates_In_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void removeDuplicates() {
        String S = "abbaca";
        String ans = "ca";
        assertEquals(ans, solution.removeDuplicates(S));
    }
}