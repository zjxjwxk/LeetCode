package com.zjxjwxk.leetcode._0552_Student_Attendance_Record_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkRecord1() {
        int n = 2;
        int ans = 8;
        assertEquals(ans, solution.checkRecord(n));
    }

    @Test
    void checkRecord2() {
        int n = 1;
        int ans = 3;
        assertEquals(ans, solution.checkRecord(n));
    }

    @Test
    void checkRecord3() {
        int n = 10101;
        int ans = 183236316;
        assertEquals(ans, solution.checkRecord(n));
    }
}