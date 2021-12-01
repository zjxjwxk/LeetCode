package com.zjxjwxk.leetcode._1446_Consecutive_Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxPower1() {
        String s = "leetcode";
        int ans = 2;
        assertEquals(ans, solution.maxPower(s));
    }

    @Test
    void maxPower2() {
        String s = "abbcccddddeeeeedcba";
        int ans = 5;
        assertEquals(ans, solution.maxPower(s));
    }

    @Test
    void maxPower3() {
        String s = "triplepillooooow";
        int ans = 5;
        assertEquals(ans, solution.maxPower(s));
    }

    @Test
    void maxPower4() {
        String s = "hooraaaaaaaaaaay";
        int ans = 11;
        assertEquals(ans, solution.maxPower(s));
    }

    @Test
    void maxPower5() {
        String s = "tourist";
        int ans = 1;
        assertEquals(ans, solution.maxPower(s));
    }
}