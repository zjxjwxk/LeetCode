package com.zjxjwxk.leetcode._0187_Repeated_DNA_Sequences;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void findRepeatedDnaSequences1() {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> ans = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        assertEquals(ans, solution2.findRepeatedDnaSequences(s));
    }

    @Test
    void findRepeatedDnaSequences2() {
        String s = "AAAAAAAAAAAAA";
        List<String> ans = Collections.singletonList("AAAAAAAAAA");
        assertEquals(ans, solution2.findRepeatedDnaSequences(s));
    }

    @Test
    void findRepeatedDnaSequences3() {
        String s = "AAAAAAAAAAA";
        List<String> ans = Collections.singletonList("AAAAAAAAAA");
        assertEquals(ans, solution2.findRepeatedDnaSequences(s));
    }
}