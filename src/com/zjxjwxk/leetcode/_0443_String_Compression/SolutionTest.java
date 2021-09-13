package com.zjxjwxk.leetcode._0443_String_Compression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void compress1() {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int ans = 6;
        assertEquals(ans, solution.compress(chars));
    }

    @Test
    void compress2() {
        char[] chars = {'a'};
        int ans = 1;
        assertEquals(ans, solution.compress(chars));
    }

    @Test
    void compress3() {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int ans = 4;
        assertEquals(ans, solution.compress(chars));
    }
}