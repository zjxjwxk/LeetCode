package com.zjxjwxk.leetcode._1894_Find_the_Student_that_Will_Replace_the_Chalk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void chalkReplacer1() {
        int[] chalk = {5, 1, 5};
        int k = 22;
        int ans = 0;
        assertEquals(ans, solution.chalkReplacer(chalk, k));
    }

    @Test
    void chalkReplacer2() {
        int[] chalk = {3, 4, 1, 2};
        int k = 25;
        int ans = 1;
        assertEquals(ans, solution.chalkReplacer(chalk, k));
    }
}