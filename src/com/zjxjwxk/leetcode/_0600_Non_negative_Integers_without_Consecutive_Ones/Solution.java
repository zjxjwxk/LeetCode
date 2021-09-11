package com.zjxjwxk.leetcode._0600_Non_negative_Integers_without_Consecutive_Ones;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/9/11 13:44
 */
public class Solution {

    public int findIntegers(int n) {
        int[] dp = new int[31];
        dp[0] = dp[1] = 1;
        for (int i = 2; i < 31; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        int ans = 0, pre = 0;
        for (int i = 29; i >= 0; --i) {
            int digit = 1 << i;
            if ((n & digit) != 0) {
                ans += dp[i + 1];
                if (pre == 1) {
                    break;
                }
                pre = 1;
            } else {
                pre = 0;
            }
            if (i == 0) {
                ++ans;
            }
        }
        return ans;
    }
}
