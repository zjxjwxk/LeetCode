package com.zjxjwxk.leetcode._0056_Merge_Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排序
 *
 * @author Xinkang Wu
 * @date 2025/6/3 22:00
 */
public class Solution {

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{};
        }
        Arrays.sort(intervals, (interval1, interval2) -> {
            return interval1[0] - interval2[0];
        });
        List<int[]> ansList = new ArrayList<>();
        ansList.add(intervals[0]);
        for (int i = 1; i < intervals.length; ++i) {
            int[] preInterval = ansList.get(ansList.size() - 1);
            int[] interval = intervals[i];
            if (interval[0] > preInterval[1]) {
                ansList.add(interval);
            } else if (interval[1] > preInterval[1]) {
                ansList.get(ansList.size() - 1)[1] = interval[1];
            }
        }
        return ansList.toArray(new int[0][0]);
    }
}
