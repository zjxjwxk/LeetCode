package com.zjxjwxk.leetcode._0318_Maximum_Product_of_Word_Lengths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void maxProduct1() {
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        int ans = 16;
        assertEquals(ans, solution2.maxProduct(words));
    }

    @Test
    void maxProduct2() {
        String[] words = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        int ans = 4;
        assertEquals(ans, solution2.maxProduct(words));
    }

    @Test
    void maxProduct3() {
        String[] words = {"a", "aa", "aaa", "aaaa"};
        int ans = 0;
        assertEquals(ans, solution2.maxProduct(words));
    }
}