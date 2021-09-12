package com.zjxjwxk.leetcode._0551_Student_Attendance_Record_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkRecord1() {
        String s = "PPALLP";
        assertTrue(solution.checkRecord(s));
    }

    @Test
    void checkRecord2() {
        String s = "PPALLL";
        assertFalse(solution.checkRecord(s));
    }
}