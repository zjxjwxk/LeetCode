package com.zjxjwxk.leetcode._3129_Find_All_Possible_Stable_Binary_Arrays_I;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2024/8/12 23:34
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
                // 因为 dp1[i - 1][j] 和 dp0[i - 1][j] 都是取余后的结果，数据可能比未取余前小很多
                // 所以 dp1[i - 1][j] + dp0[i - 1][j] - dp1[i - 1 - limit][j] 可能为负数
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
