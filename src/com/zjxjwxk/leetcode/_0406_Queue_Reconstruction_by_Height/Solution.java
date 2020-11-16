package com.zjxjwxk.leetcode._0406_Queue_Reconstruction_by_Height;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 从低到高考虑
 * @author Xinkang Wu
 * @date 2020/11/16 10:23
 */
public class Solution {

    public int[][] reconstructQueue(int[][] people) {
        int len = people.length;
        Comparator<int[]> comparator = (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o1[0] - o2[0];
            } else {
                return o2[1] - o1[1];
            }
        };
        Arrays.sort(people, comparator);
        int[][] ans = new int[len][];
        for (int[] person : people) {
            int spaces = person[1] + 1;
            for (int i = 0; i < len; ++i) {
                if (ans[i] == null) {
                    --spaces;
                    if (spaces == 0) {
                        ans[i] = person;
                    }
                }
            }
        }
        return ans;
    }
}
