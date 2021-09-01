package com.zjxjwxk.leetcode._0165_Compare_Version_Numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void compareVersion1() {
        String version1 = "1.01";
        String version2 = "1.001";
        int ans = 0;
        assertEquals(ans, solution2.compareVersion(version1, version2));
    }

    @Test
    void compareVersion2() {
        String version1 = "1.0";
        String version2 = "1.0.0";
        int ans = 0;
        assertEquals(ans, solution2.compareVersion(version1, version2));
    }

    @Test
    void compareVersion3() {
        String version1 = "0.1";
        String version2 = "1.1";
        int ans = -1;
        assertEquals(ans, solution2.compareVersion(version1, version2));
    }

    @Test
    void compareVersion4() {
        String version1 = "1.0.1";
        String version2 = "1";
        int ans = 1;
        assertEquals(ans, solution2.compareVersion(version1, version2));
    }

    @Test
    void compareVersion5() {
        String version1 = "7.5.2.4";
        String version2 = "7.5.3";
        int ans = -1;
        assertEquals(ans, solution2.compareVersion(version1, version2));
    }
}