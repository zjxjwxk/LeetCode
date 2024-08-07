package com.zjxjwxk.leetcode._0600_Non_negative_Integers_without_Consecutive_Ones;

/**
 * 动态规划、二叉树
 * @author Xinkang Wu
 * @date 2024/8/6 00:29
 */
public class Solution2 {
    public int findIntegers(int n) {
        int[] dp = new int[31];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= 30; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        int len = (int) (Math.log(n) / Math.log(2)) + 1, pre = 0, ans = 0;
        for (int i = len - 1; i >= 0; --i) {
            if ((n & (1 << i)) != 0) {
                // 当前位为1，包含两个子结点0和1，计算左子结点0所贡献的满二叉树，并前往右子结点1
                ans += dp[i + 1];
                if (pre == 1) {
                    break;
                }
                pre = 1;
            } else {
                // 当前位为0，只包含一个左子结点0，直接前往左子结点0
                pre = 0;
            }
            if (i == 0) {
                ++ans;
            }
        }
        return ans;
    }
}
