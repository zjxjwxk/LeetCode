package com.zjxjwxk.leetcode._3130_Find_All_Possible_Stable_Binary_Arrays_II;

/**
 * @author Xinkang Wu
 * @date 2024/8/13 00:29
 */
public class Solution {

    public int numberOfStableArrays(int zero, int one, int limit) {
        final long MOD = 1000000007;
        long[][] dp0 = new long[zero + 1][one + 1];
        long[][] dp1 = new long[zero + 1][one + 1];
        for (int i = 1; i <= zero && i <= limit; ++i) {
            dp0[i][0] = 1;
        }
        for (int j = 1; j <= one && j <= limit; ++j) {
            dp1[0][j] = 1;
        }
        for (int i = 1; i <= zero; ++i) {
            for (int j = 1; j <= one; ++j) {
                if (i <= limit) {
                    dp0[i][j] = dp1[i - 1][j] + dp0[i - 1][j];
                } else {
                    dp0[i][j] = dp1[i - 1][j] + dp0[i - 1][j] - dp1[i - 1 - limit][j];
                }
                dp0[i][j] = (dp0[i][j] % MOD + MOD) % MOD;
                if (j <= limit) {
                    dp1[i][j] = dp0[i][j - 1] + dp1[i][j - 1];
                } else {
                    dp1[i][j] = dp0[i][j - 1] + dp1[i][j - 1] - dp0[i][j - 1 - limit];
                }
                dp1[i][j] = (dp1[i][j] % MOD + MOD) % MOD;
            }
        }
        return (int) ((dp0[zero][one] + dp1[zero][one]) % MOD);
    }
}
