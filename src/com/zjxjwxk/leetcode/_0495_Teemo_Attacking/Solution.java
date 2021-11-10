package com.zjxjwxk.leetcode._0495_Teemo_Attacking;

/**
 * @author Xinkang Wu
 * @date 2021/11/10 14:23
 */
public class Solution {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;
        for (int i = 1; i < timeSeries.length; ++i) {
            ans += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }
        return ans + duration;
    }
}
