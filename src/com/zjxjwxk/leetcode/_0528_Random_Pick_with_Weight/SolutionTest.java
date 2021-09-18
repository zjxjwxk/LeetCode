package com.zjxjwxk.leetcode._0528_Random_Pick_with_Weight;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void pickIndex1() {
        int[] w = {1};
        Solution solution = new Solution(w);
        System.out.println(solution.pickIndex());
        System.out.println(solution.pickIndex());
        System.out.println(solution.pickIndex());
        System.out.println(solution.pickIndex());
        System.out.println(solution.pickIndex());
    }

    @Test
    void pickIndex2() {
        int[] w = {1, 3};
        Solution solution = new Solution(w);
        System.out.println(solution.pickIndex());
        System.out.println(solution.pickIndex());
        System.out.println(solution.pickIndex());
        System.out.println(solution.pickIndex());
        System.out.println(solution.pickIndex());
    }
}