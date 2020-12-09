package com.zjxjwxk.leetcode._0842_Split_Array_into_Fibonacci_Sequence;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void splitIntoFibonacci1() {
        String S = "123456579";
        Integer[] ans = {123, 456, 579};
        List<Integer> ansList = new ArrayList<>();
        Collections.addAll(ansList, ans);
        assertEquals(ansList, solution.splitIntoFibonacci(S));
    }

    @Test
    void splitIntoFibonacci2() {
        String S = "11235813";
        Integer[] ans = {1, 1, 2, 3, 5, 8, 13};
        List<Integer> ansList = new ArrayList<>();
        Collections.addAll(ansList, ans);
        assertEquals(ansList, solution.splitIntoFibonacci(S));
    }

    @Test
    void splitIntoFibonacci3() {
        String S = "112358130";
        Integer[] ans = {};
        List<Integer> ansList = new ArrayList<>();
        Collections.addAll(ansList, ans);
        assertEquals(ansList, solution.splitIntoFibonacci(S));
    }

    @Test
    void splitIntoFibonacci4() {
        String S = "0123";
        Integer[] ans = {};
        List<Integer> ansList = new ArrayList<>();
        Collections.addAll(ansList, ans);
        assertEquals(ansList, solution.splitIntoFibonacci(S));
    }

    @Test
    void splitIntoFibonacci5() {
        String S = "1101111";
        Integer[] ans = {11, 0, 11, 11};
        List<Integer> ansList = new ArrayList<>();
        Collections.addAll(ansList, ans);
        assertEquals(ansList, solution.splitIntoFibonacci(S));
    }

    @Test
    void splitIntoFibonacci6() {
        String S = "214748364721474836422147483641";
        Integer[] ans = {};
        List<Integer> ansList = new ArrayList<>();
        Collections.addAll(ansList, ans);
        assertEquals(ansList, solution.splitIntoFibonacci(S));
    }

    @Test
    void splitIntoFibonacci7() {
        String S = "417420815174208193484163452262453871040871393665402264706273658371675923077949581449611550452755";
        Integer[] ans = {4, 17420815, 17420819, 34841634, 52262453, 87104087, 139366540, 226470627, 365837167, 592307794, 958144961, 1550452755};
        List<Integer> ansList = new ArrayList<>();
        Collections.addAll(ansList, ans);
        assertEquals(ansList, solution.splitIntoFibonacci(S));
    }
}