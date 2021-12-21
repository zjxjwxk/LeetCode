package com.zjxjwxk.leetcode._1154_Day_of_the_Year;

/**
 * @author Xinkang Wu
 * @date 2021/12/21 14:28
 */
public class Solution {

    private static final int[] PRE_SUM;

    static {
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        PRE_SUM = new int[13];
        for (int i = 1; i <= 12; ++i) {
            PRE_SUM[i] = PRE_SUM[i - 1] + months[i - 1];
        }
    }

    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        boolean isLeap = (year % 4 == 0) && (year % 100 != 0) || year % 400 == 0;
        return PRE_SUM[month] + (month > 2 && isLeap ? 1 : 0) + day;
    }
}
