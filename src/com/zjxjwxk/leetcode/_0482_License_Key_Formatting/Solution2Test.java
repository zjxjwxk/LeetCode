package com.zjxjwxk.leetcode._0482_License_Key_Formatting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void licenseKeyFormatting1() {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String ans = "5F3Z-2E9W";
        assertEquals(ans, solution2.licenseKeyFormatting(s, k));
    }

    @Test
    void licenseKeyFormatting2() {
        String s = "2-5g-3-J";
        int k = 2;
        String ans = "2-5G-3J";
        assertEquals(ans, solution2.licenseKeyFormatting(s, k));
    }
}