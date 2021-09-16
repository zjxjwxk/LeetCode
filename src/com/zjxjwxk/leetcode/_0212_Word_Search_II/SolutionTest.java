package com.zjxjwxk.leetcode._0212_Word_Search_II;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findWords1() {
        char[][] borad = {
                {'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> ans = Arrays.asList("oath", "eat");
        assertEquals(ans, solution.findWords(borad, words));
    }

    @Test
    void findWords2() {
        char[][] borad = {
                {'a', 'b'}, {'c', 'd'}
        };
        String[] words = {"abcb"};
        List<String> ans = new ArrayList<>();
        assertEquals(ans, solution.findWords(borad, words));
    }

    @Test
    void findWords3() {
        char[][] borad = {
                {'a'}
        };
        String[] words = {"a"};
        List<String> ans = Collections.singletonList("a");
        assertEquals(ans, solution.findWords(borad, words));
    }

    @Test
    void findWords4() {
        char[][] borad = {
                {'o', 'a', 'b', 'n'}, {'o', 't', 'a', 'e'}, {'a', 'h', 'k', 'r'}, {'a', 'f', 'l', 'v'}
        };
        String[] words = {"oa", "oaa"};
        List<String> ans = Arrays.asList("oa", "oaa");
        assertEquals(ans, solution.findWords(borad, words));
    }

    @Test
    void findWords5() {
        char[][] borad = {
                {'a'}, {'a'}
        };
        String[] words = {"aaa"};
        List<String> ans = new ArrayList<>();
        assertEquals(ans, solution.findWords(borad, words));
    }
}