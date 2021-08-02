package com.zjxjwxk.leetcode._1736_Latest_Time_by_Replacing_Hidden_Digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumTime1() {
        String time = "2?:?0";
        String ans = "23:50";
        assertEquals(ans, solution.maximumTime(time));
    }

    @Test
    void maximumTime2() {
        String time = "0?:3?";
        String ans = "09:39";
        assertEquals(ans, solution.maximumTime(time));
    }

    @Test
    void maximumTime3() {
        String time = "1?:22";
        String ans = "19:22";
        assertEquals(ans, solution.maximumTime(time));
    }

    @Test
    void maximumTime4() {
        String time = "?0:15";
        String ans = "20:15";
        assertEquals(ans, solution.maximumTime(time));
    }
}