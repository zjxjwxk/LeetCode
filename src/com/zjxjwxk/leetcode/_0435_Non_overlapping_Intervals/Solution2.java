package com.zjxjwxk.leetcode._0435_Non_overlapping_Intervals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 贪心+二分查找
 * @author Xinkang Wu
 * @date 2021/1/1 23:17
 */
public class Solution2 {

    public int eraseOverlapIntervals(int[][] intervals) {
        int len = intervals.length, maxLength = 1;
        if (len == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        int[][] d = new int[len + 1][2];
        d[1] = intervals[0];
        for (int i = 1; i < len; ++i) {
            if (intervals[i][0] >= d[maxLength][1]) {
                d[++maxLength] = intervals[i];
            } else {
                int index = findIndex(d, 1, maxLength - 1, intervals[i]);
                if (intervals[i][1] < d[index + 1][1]) {
                    d[index + 1] = intervals[i];
                }
            }
        }
        return len - maxLength;
    }

    private int findIndex(int[][] d, int left, int right, int[] target) {
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (target[0] < d[mid][1]) {
                right = mid - 1;
            } else if (target[0] > d[mid][1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
