package com.zjxjwxk.leetcode._0526_Beautiful_Arrangement;

/**
 * 状态压缩 + 动态规划
 * @author Xinkang Wu
 * @date 2021/9/8 18:24
 */
public class Solution2 {

    public int countArrangement(int n) {
        int[] dp = new int[1 << n];
        dp[0] = 1;
        for (int mask = 1; mask < (1 << n); ++mask) {
            int num = Integer.bitCount(mask);
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0 && ((i + 1) % num == 0 || num % (i + 1) == 0)) {
                    dp[mask] += dp[mask ^ (1 << i)];
                }
            }
        }
        return dp[(1 << n) - 1];
    }
}
