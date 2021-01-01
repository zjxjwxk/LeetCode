package com.zjxjwxk.leetcode._0435_Non_overlapping_Intervals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2020/12/31 22:52
 */
public class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        int len = intervals.length;
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len];
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        for (int i = 0; i < len; ++i) {
            dp[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (intervals[j][1] <= intervals[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return len - dp[len - 1];
    }
}
