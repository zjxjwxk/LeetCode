package com.zjxjwxk.leetcode._0412_Fizz_Buzz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void fizzBuzz1() {
        int n = 3;
        List<String> ans = Arrays.asList("1", "2", "Fizz");
        assertEquals(ans, solution.fizzBuzz(n));
    }

    @Test
    void fizzBuzz2() {
        int n = 5;
        List<String> ans = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        assertEquals(ans, solution.fizzBuzz(n));
    }

    @Test
    void fizzBuzz() {
        int n = 15;
        List<String> ans = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(ans, solution.fizzBuzz(n));
    }
}