package com.zjxjwxk.leetcode._0060_Permutation_Sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void getPermutation1() {
        int n = 3, k = 3;
        String ans = "213";
        assertEquals(ans, solution2.getPermutation(n, k));
    }

    @Test
    void getPermutation2() {
        int n = 4, k = 9;
        String ans = "2314";
        assertEquals(ans, solution2.getPermutation(n, k));
    }

    @Test
    void getPermutation3() {
        int n = 3, k = 1;
        String ans = "123";
        assertEquals(ans, solution2.getPermutation(n, k));
    }

    @Test
    void getPermutation4() {
        int n = 3, k = 5;
        String ans = "312";
        assertEquals(ans, solution2.getPermutation(n, k));
    }
}