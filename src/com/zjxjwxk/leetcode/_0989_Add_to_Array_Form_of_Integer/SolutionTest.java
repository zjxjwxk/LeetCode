package com.zjxjwxk.leetcode._0989_Add_to_Array_Form_of_Integer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void addToArrayForm1() {
        int[] A = {1, 2, 0, 0};
        int K = 34;
        List<Integer> ans = Arrays.asList(1, 2, 3, 4);
        assertEquals(ans, solution.addToArrayForm(A, K));
    }

    @Test
    void addToArrayForm2() {
        int[] A = {2, 7, 4};
        int K = 181;
        List<Integer> ans = Arrays.asList(4, 5, 5);
        assertEquals(ans, solution.addToArrayForm(A, K));
    }

    @Test
    void addToArrayForm3() {
        int[] A = {2, 1, 5};
        int K = 806;
        List<Integer> ans = Arrays.asList(1, 0, 2, 1);
        assertEquals(ans, solution.addToArrayForm(A, K));
    }

    @Test
    void addToArrayForm4() {
        int[] A = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int K = 1;
        List<Integer> ans = Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(ans, solution.addToArrayForm(A, K));
    }

    @Test
    void addToArrayForm5() {
        int[] A = {0};
        int K = 23;
        List<Integer> ans = Arrays.asList(2, 3);
        assertEquals(ans, solution.addToArrayForm(A, K));
    }

    @Test
    void addToArrayForm6() {
        int[] A = {1};
        int K = 999;
        List<Integer> ans = Arrays.asList(1, 0, 0, 0);
        assertEquals(ans, solution.addToArrayForm(A, K));
    }
}