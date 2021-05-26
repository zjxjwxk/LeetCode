package com.zjxjwxk.leetcode._1190_Reverse_Substrings_Between_Each_Pair_of_Parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void reverseParentheses1() {
        String s = "(abcd)";
        String ans = "dcba";
        assertEquals(ans, solution2.reverseParentheses(s));
    }

    @Test
    void reverseParentheses2() {
        String s = "(u(love)i)";
        String ans = "iloveu";
        assertEquals(ans, solution2.reverseParentheses(s));
    }

    @Test
    void reverseParentheses3() {
        String s = "(ed(et(oc))el)";
        String ans = "leetcode";
        assertEquals(ans, solution2.reverseParentheses(s));
    }

    @Test
    void reverseParentheses4() {
        String s = "a(bcdefghijkl(mno)p)q";
        String ans = "apmnolkjihgfedcbq";
        assertEquals(ans, solution2.reverseParentheses(s));
    }
}