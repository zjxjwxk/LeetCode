package com.zjxjwxk.leetcode._0352_Data_Stream_as_Disjoint_Intervals;

import java.util.Map;
import java.util.TreeMap;

/**
 * 有序映射
 * @author Xinkang Wu
 * @date 2021/10/9 17:13
 */
public class SummaryRanges2 {

    private final TreeMap<Integer, Integer> intervalMap;

    public SummaryRanges2() {
        intervalMap = new TreeMap<>();
    }

    public void addNum(int val) {
        Map.Entry<Integer, Integer> floorEntry = intervalMap.floorEntry(val);
        Map.Entry<Integer, Integer> ceilingEntry = intervalMap.ceilingEntry(val);
        if ((floorEntry == null || val > floorEntry.getValue() + 1) && (ceilingEntry == null || val < ceilingEntry.getKey() - 1)) {
            intervalMap.put(val, val);
        } else if (floorEntry != null && ceilingEntry != null && val == floorEntry.getValue() + 1 && val == ceilingEntry.getKey() - 1) {
            intervalMap.put(floorEntry.getKey(), ceilingEntry.getValue());
            intervalMap.remove(ceilingEntry.getKey());
        } else if (floorEntry != null && val == floorEntry.getValue() + 1) {
            intervalMap.put(floorEntry.getKey(), val);
        } else if (ceilingEntry != null && val == ceilingEntry.getKey() - 1) {
            intervalMap.put(val, ceilingEntry.getValue());
            intervalMap.remove(ceilingEntry.getKey());
        }
    }

    public int[][] getIntervals() {
        int[][] intervals = new int[intervalMap.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> interval : intervalMap.entrySet()) {
            intervals[index++] = new int[]{interval.getKey(), interval.getValue()};
        }
        return intervals;
    }
}
