package com.zjxjwxk.leetcode._0282_Expression_Add_Operators;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void addOperators1() {
        String num = "123";
        int target = 6;
        List<String> ans = Arrays.asList("1+2+3", "1*2*3");
        assertEquals(ans, solution.addOperators(num, target));
    }

    @Test
    void addOperators2() {
        String num = "232";
        int target = 8;
        List<String> ans = Arrays.asList("2+3*2", "2*3+2");
        assertEquals(ans, solution.addOperators(num, target));
    }

    @Test
    void addOperators3() {
        String num = "105";
        int target = 5;
        List<String> ans = Arrays.asList("1*0+5", "10-5");
        assertEquals(ans, solution.addOperators(num, target));
    }

    @Test
    void addOperators4() {
        String num = "00";
        int target = 0;
        List<String> ans = Arrays.asList("0+0", "0-0", "0*0");
        assertEquals(ans, solution.addOperators(num, target));
    }

    @Test
    void addOperators5() {
        String num = "3456237490";
        int target = 9191;
        List<String> ans = new ArrayList<>();
        assertEquals(ans, solution.addOperators(num, target));
    }

    @Test
    void addOperators6() {
        String num = "2147483648";
        int target = Integer.MIN_VALUE;
        List<String> ans = new ArrayList<>();
        assertEquals(ans, solution.addOperators(num, target));
    }
}