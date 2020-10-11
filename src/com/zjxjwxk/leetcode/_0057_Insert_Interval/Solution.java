package com.zjxjwxk.leetcode._0057_Insert_Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zjxjwxk
 * @date 2020/10/11 12:18 下午
 */
public class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int len = intervals.length;
        int index1 = findIndex(intervals, 0, len - 1, newInterval[0]);
        int index2 = findIndex(intervals, index1, len - 1, newInterval[1]);
        for (int i = 0; i < len; ++i) {
            if (i < index1 || i > index2) {
                ansList.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else if (i == index1) {
                temp.add(Math.min(newInterval[0], intervals[index1][0]));
            }
            if (i == index2) {
                if (newInterval[1] < intervals[index2][0]) {
                    temp.add(newInterval[1]);
                    ansList.add(temp);
                    ansList.add(Arrays.asList(intervals[i][0], intervals[i][1]));
                } else {
                    temp.add(intervals[index2][1]);
                    ansList.add(temp);
                }
            }
        }
        if (index1 >= len) {
            ansList.add(Arrays.asList(newInterval[0], newInterval[1]));
        } else if (index2 >= len) {
            temp.add(newInterval[1]);
            ansList.add(temp);
        }
        int ansLen = ansList.size();
        int[][] ans = new int[ansList.size()][2];
        for (int i = 0; i < ansLen; ++i) {
            ans[i][0] = ansList.get(i).get(0);
            ans[i][1] = ansList.get(i).get(1);
        }
        return ans;
    }

    private int findIndex(int[][] intervals, int left, int right, int target) {
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (target < intervals[mid][1]) {
                right = mid - 1;
            } else if (target > intervals[mid][1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] intervals = {{1, 3}, {6, 9}};
//        int[] newInterval = {2, 5};
//        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
//        int[] newInterval = {4, 8};
        int[][] intervals = {{1, 5}};
        int[] newInterval = {2, 7};
        int[][] ans = solution.insert(intervals, newInterval);
        int ansLen = ans.length;
        for (int i = 0; i < ansLen; ++i) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print("[" + ans[i][0] + ", " + ans[i][1] + "]");
        }
    }
}
