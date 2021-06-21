package com.zjxjwxk.leetcode._1239_Maximum_Length_of_a_Concatenated_String_with_Unique_Characters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxLength1() {
        List<String> arr = Arrays.asList("un", "iq", "ue");
        int ans = 4;
        assertEquals(ans, solution.maxLength(arr));
    }

    @Test
    void maxLength2() {
        List<String> arr = Arrays.asList("cha", "r", "act", "ers");
        int ans = 6;
        assertEquals(ans, solution.maxLength(arr));
    }

    @Test
    void maxLength3() {
        List<String> arr = Collections.singletonList("abcdefghijklmnopqrstuvwxyz");
        int ans = 26;
        assertEquals(ans, solution.maxLength(arr));
    }
}