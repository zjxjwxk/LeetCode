package com.zjxjwxk.leetcode._0060_Permutation_Sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getPermutation1() {
        int n = 3, k = 3;
        String ans = "213";
        assertEquals(ans, solution.getPermutation(n, k));
    }

    @Test
    void getPermutation2() {
        int n = 4, k = 9;
        String ans = "2314";
        assertEquals(ans, solution.getPermutation(n, k));
    }

    @Test
    void getPermutation3() {
        int n = 3, k = 1;
        String ans = "123";
        assertEquals(ans, solution.getPermutation(n, k));
    }

    @Test
    void getPermutation4() {
        int n = 3, k = 5;
        String ans = "312";
        assertEquals(ans, solution.getPermutation(n, k));
    }
}