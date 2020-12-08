package com.zjxjwxk.leetcode._0621_Task_Scheduler;

import java.util.*;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2020/12/8 11:35
 */
public class Solution {

    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char task : tasks) {
            countMap.merge(task, 1, Integer::sum);
        }
        List<Integer> countList = new ArrayList<>();
        List<Integer> validTimeList = new ArrayList<>();
        for (Integer count : countMap.values()) {
            countList.add(count);
            validTimeList.add(1);
        }
        int time = 0;
        for (int i = 0; i < tasks.length; ++i) {
            ++time;
            int minValidTime = Integer.MAX_VALUE, maxIndex = -1;
            for (int j = 0; j < countList.size(); ++j) {
                if (countList.get(j) != 0) {
                    minValidTime = Math.min(minValidTime, validTimeList.get(j));
                }
            }
            time = Math.max(time, minValidTime);
            for (int j = 0; j < countList.size(); ++j) {
                if (countList.get(j) != 0 && validTimeList.get(j) <= time) {
                    if (maxIndex == -1 || countList.get(j) > countList.get(maxIndex)) {
                        maxIndex = j;
                    }
                }
            }
            countList.set(maxIndex, countList.get(maxIndex) - 1);
            validTimeList.set(maxIndex, validTimeList.get(maxIndex) + n + 1);
        }
        return time;
    }
}
