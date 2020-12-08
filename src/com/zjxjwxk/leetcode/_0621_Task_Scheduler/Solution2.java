package com.zjxjwxk.leetcode._0621_Task_Scheduler;

import java.util.HashMap;
import java.util.Map;

/**
 * 构造
 * @author Xinkang Wu
 * @date 2020/12/8 21:03
 */
public class Solution2 {

    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        for (char task : tasks) {
            countMap.merge(task, 1, Integer::sum);
            maxCount = Math.max(maxCount, countMap.get(task));
        }
        int maxCountNum = 0;
        for (Integer count : countMap.values()) {
            if (count == maxCount) {
                ++maxCountNum;
            }
        }
        return Math.max((maxCount - 1) * (n + 1) + maxCountNum, tasks.length);
    }
}
