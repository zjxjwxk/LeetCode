package com.zjxjwxk.leetcode._1370_Increasing_Decreasing_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortString1() {
        String s = "aaaabbbbcccc";
        String ans = "abccbaabccba";
        assertEquals(ans, solution.sortString(s));
    }

    @Test
    void sortString2() {
        String s = "rat";
        String ans = "art";
        assertEquals(ans, solution.sortString(s));
    }

    @Test
    void sortString3() {
        String s = "leetcode";
        String ans = "cdelotee";
        assertEquals(ans, solution.sortString(s));
    }

    @Test
    void sortString4() {
        String s = "ggggggg";
        String ans = "ggggggg";
        assertEquals(ans, solution.sortString(s));
    }

    @Test
    void sortString5() {
        String s = "spo";
        String ans = "ops";
        assertEquals(ans, solution.sortString(s));
    }
}