package com.zjxjwxk.leetcode._0925_Long_Pressed_Name;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isLongPressedName1() {
        String name = "alex", typed = "aaleex";
        assertTrue(solution.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName2() {
        String name = "saeed", typed = "ssaaedd";
        assertFalse(solution.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName3() {
        String name = "leelee", typed = "lleeelee";
        assertTrue(solution.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName4() {
        String name = "laiden", typed = "laiden";
        assertTrue(solution.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName5() {
        String name = "pyplrz", typed = "ppyypllr";
        assertFalse(solution.isLongPressedName(name, typed));
    }
}