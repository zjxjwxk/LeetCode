package com.zjxjwxk.leetcode._0352_Data_Stream_as_Disjoint_Intervals;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * 有序集合
 * @author Xinkang Wu
 * @date 2021/10/9 17:13
 */
public class SummaryRanges {

    private final TreeSet<Integer> treeSet;

    public SummaryRanges() {
        treeSet = new TreeSet<>();
    }

    public void addNum(int val) {
        treeSet.add(val);
    }

    public int[][] getIntervals() {
        int pre = -1;
        List<int[]> ans = new ArrayList<>();
        int[] interval = new int[2];
        for (Integer val : treeSet) {
            if (pre != -1) {
                if (val > pre + 1) {
                    interval[1] = pre;
                    ans.add(interval);
                    interval = new int[2];
                    interval[0] = val;
                }
            } else {
                interval[0] = val;
            }
            pre = val;
        }
        interval[1] = pre;
        ans.add(interval);
        return ans.toArray(new int[ans.size()][]);
    }
}
