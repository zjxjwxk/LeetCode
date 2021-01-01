package com.zjxjwxk.leetcode._0435_Non_overlapping_Intervals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2021/1/2 00:31
 */
public class Solution3 {

    public int eraseOverlapIntervals(int[][] intervals) {
        int len = intervals.length;
        if (len == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[1]));
        int preRight = intervals[0][1], maxLength = 1;
        for (int i = 1; i < len; ++i) {
            if (intervals[i][0] >= preRight) {
                preRight = intervals[i][1];
                ++maxLength;
            }
        }
        return len - maxLength;
    }
}
