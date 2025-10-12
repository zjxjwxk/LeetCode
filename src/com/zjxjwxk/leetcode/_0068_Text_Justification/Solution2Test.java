package com.zjxjwxk.leetcode._0068_Text_Justification;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void fullJustify1() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> ans = Arrays.asList(
                "This    is    an",
                "example  of text",
                "justification.  "
        );
        assertEquals(ans, solution2.fullJustify(words, maxWidth));
    }

    @Test
    void fullJustify2() {
        String[] words = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int maxWidth = 16;
        List<String> ans = Arrays.asList(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "
        );
        assertEquals(ans, solution2.fullJustify(words, maxWidth));
    }

    @Test
    void fullJustify3() {
        String[] words = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        int maxWidth = 20;
        List<String> ans = Arrays.asList(
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "
        );
        assertEquals(ans, solution2.fullJustify(words, maxWidth));
    }
}