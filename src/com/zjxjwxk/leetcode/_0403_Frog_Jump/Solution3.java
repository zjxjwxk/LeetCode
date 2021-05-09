package com.zjxjwxk.leetcode._0403_Frog_Jump;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/5/9 14:23
 */
public class Solution3 {

    public boolean canCross(int[] stones) {
        int len = stones.length;
        for (int i = 1; i < len; ++i) {
            if (stones[i] - stones[i - 1] > i) {
                return false;
            }
        }
        boolean[][] dp = new boolean[len][len];
        dp[0][0] = true;
        for (int i = 1; i < len; ++i) {
            for (int j = i - 1; j >= 0; --j) {
                int k = stones[i] - stones[j];
                if (j + 1 < k) {
                    break;
                }
                dp[i][k] = dp[j][k - 1] || dp[j][k] || dp[j][k + 1];
                if (i == len - 1 && dp[i][k]) {
                    return true;
                }
            }
        }
        return false;
    }
}
