package com.zjxjwxk.leetcode._0551_Student_Attendance_Record_I;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2021/9/12 16:54
 */
public class Solution {

    public boolean checkRecord(String s) {
        char[] chArr = s.toCharArray();
        int countA = 0, countL = 0;
        for (char ch : chArr) {
            if (ch == 'A') {
                if (++countA == 2) {
                    return false;
                }
            }
            if (ch == 'L') {
                if (++countL == 3) {
                    return false;
                }
            } else {
                countL = 0;
            }
        }
        return true;
    }
}
