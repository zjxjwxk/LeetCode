package com.zjxjwxk.leetcode._0552_Student_Attendance_Record_II;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/9/13 10:08
 */
public class Solution {

    private static final int MOD = 1000000007;

    public int checkRecord(int n) {
        int[][] dp = new int[2][3];
        dp[0][0] = 1;
        for (int i = 1; i <= n; ++i) {
            int[][] dpNew = new int[2][3];
            // P
            for (int j = 0; j <= 1; ++j) {
                for (int k = 0; k <= 2; ++k) {
                    dpNew[j][0] = (dpNew[j][0] + dp[j][k]) % MOD;
                }
            }
            // A
            for (int k = 0; k <= 2; ++k) {
                dpNew[1][0] = (dpNew[1][0] + dp[0][k]) % MOD;
            }
            // L
            for (int j = 0; j <= 1; ++j) {
                for (int k = 1; k <= 2; ++k) {
                    dpNew[j][k] = (dpNew[j][k] + dp[j][k - 1]) % MOD;
                }
            }
            dp = dpNew;
        }
        int ans = 0;
        for (int j = 0; j <= 1; ++j) {
            for (int k = 0; k <= 2; ++k) {
                ans = (ans + dp[j][k]) % MOD;
            }
        }
        return ans;
    }
}
