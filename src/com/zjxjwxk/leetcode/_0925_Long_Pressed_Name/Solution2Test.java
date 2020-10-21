package com.zjxjwxk.leetcode._0925_Long_Pressed_Name;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void isLongPressedName1() {
        String name = "alex", typed = "aaleex";
        assertTrue(solution2.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName2() {
        String name = "saeed", typed = "ssaaedd";
        assertFalse(solution2.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName3() {
        String name = "leelee", typed = "lleeelee";
        assertTrue(solution2.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName4() {
        String name = "laiden", typed = "laiden";
        assertTrue(solution2.isLongPressedName(name, typed));
    }

    @Test
    void isLongPressedName5() {
        String name = "pyplrz", typed = "ppyypllr";
        assertFalse(solution2.isLongPressedName(name, typed));
    }
}