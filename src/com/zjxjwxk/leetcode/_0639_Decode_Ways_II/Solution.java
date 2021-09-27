package com.zjxjwxk.leetcode._0639_Decode_Ways_II;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/9/27 16:29
 */
public class Solution {

    private static final int MOD = 1000000007;

    public int numDecodings(String s) {
        char[] chArr = s.toCharArray();
        long dp1 = 1, dp2 = 1, dp3 = 0;
        for (int i = 0; i < chArr.length; ++i) {
            dp3 = 0;
            if (chArr[i] == '*') {
                dp3 = (dp3 + dp2 * 9) % MOD;
            } else if (chArr[i] != '0') {
                dp3 = (dp3 + dp2) % MOD;
            }
            if (i >= 1) {
                if (chArr[i - 1] == '*') {
                    if (chArr[i] == '*') {
                        dp3 = (dp3 + dp1 * 15) % MOD;
                    } else if (chArr[i] >= '0' && chArr[i] <= '6') {
                        dp3 = (dp3 + dp1 * 2) % MOD;
                    } else {
                        dp3 = (dp3 + dp1) % MOD;
                    }
                } else if (chArr[i - 1] == '1') {
                    if (chArr[i] == '*') {
                        dp3 = (dp3 + dp1 * 9) % MOD;
                    } else {
                        dp3 = (dp3 + dp1) % MOD;
                    }
                } else if (chArr[i - 1] == '2') {
                    if (chArr[i] == '*') {
                        dp3 = (dp3 + dp1 * 6) % MOD;
                    } else if (chArr[i] >= '0' && chArr[i] <= '6') {
                        dp3 = (dp3 + dp1) % MOD;
                    }
                }
            }
            dp1 = dp2;
            dp2 = dp3;
        }
        return (int) dp3;
    }
}
