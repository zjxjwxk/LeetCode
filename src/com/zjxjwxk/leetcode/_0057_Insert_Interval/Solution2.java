package com.zjxjwxk.leetcode._0057_Insert_Interval;

import java.util.LinkedList;

/**
 * @author zjxjwxk
 * @date 2020/10/11 2:42 下午
 */
public class Solution2 {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0], newEnd = newInterval[1], index = 0, len = intervals.length;
        LinkedList<int[]> ansList = new LinkedList<>();
        while (index < len && intervals[index][0] < newStart) {
            ansList.add(intervals[index++]);
        }
        int[] interval;
        if (ansList.isEmpty() || ansList.getLast()[1] < newStart) {
            ansList.add(newInterval);
        } else {
            if (newEnd > ansList.getLast()[1]) {
                interval = ansList.removeLast();
                interval[1] = newEnd;
                ansList.add(interval);
            }
        }
        while (index < len) {
            interval = intervals[index++];
            int start = interval[0], end = interval[1];
            if (start <= ansList.getLast()[1]) {
                if (end > ansList.getLast()[1]) {
                    interval = ansList.removeLast();
                    interval[1] = end;
                    ansList.add(interval);
                }
            } else {
                ansList.add(interval);
            }
        }
        return ansList.toArray(new int[ansList.size()][2]);
    }
}
