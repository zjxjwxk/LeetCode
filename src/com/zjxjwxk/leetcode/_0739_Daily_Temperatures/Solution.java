package com.zjxjwxk.leetcode._0739_Daily_Temperatures;

import java.util.Arrays;

/**
 * 暴力
 * @author Xinkang Wu
 * @date 2022/1/22 17:41
 */
public class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        int[] next = new int[101];
        Arrays.fill(next, Integer.MAX_VALUE);
        for (int i = len - 1; i >= 0; --i) {
            int minIndex = Integer.MAX_VALUE;
            for (int t = temperatures[i] + 1; t <= 100; ++t) {
                minIndex = Math.min(minIndex, next[t]);
            }
            if (minIndex != Integer.MAX_VALUE) {
                ans[i] = minIndex - i;
            }
            next[temperatures[i]] = i;
        }
        return ans;
    }
}
