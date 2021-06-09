package com.zjxjwxk.leetcode._1049_Last_Stone_Weight_II;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/6/9 23:00
 */
public class Solution {

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int capacity = (sum >> 1);
        int[] dp = new int[capacity + 1];
        for (int stone : stones) {
            for (int j = capacity; j >= stone; --j) {
                dp[j] = Math.max(dp[j], dp[j - stone] + stone);
            }
        }
        return sum - (dp[capacity] << 1);
    }
}
