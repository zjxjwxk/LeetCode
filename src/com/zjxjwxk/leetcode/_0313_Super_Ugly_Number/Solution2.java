package com.zjxjwxk.leetcode._0313_Super_Ugly_Number;

import java.util.Arrays;

/**
 * 动态规划
 * 时间复杂度：O(nm)
 * @author Xinkang Wu
 * @date 2021/9/2 18:26
 */
public class Solution2 {

    public int nthSuperUglyNumber(int n, int[] primes) {
        int m = primes.length;
        int[] dp = new int[n + 1];
        int[] pointers = new int[m];
        dp[1] = 1;
        Arrays.fill(pointers, 1);
        for (int i = 2; i <= n; ++i) {
            dp[i] = Integer.MAX_VALUE;
            int[] nums = new int[m];
            for (int j = 0; j < m; ++j) {
                nums[j] = dp[pointers[j]] * primes[j];
                dp[i] = Math.min(dp[i], nums[j]);
            }
            for (int j = 0; j < m; ++j) {
                if (nums[j] == dp[i]) {
                    ++pointers[j];
                }
            }
        }
        return dp[n];
    }
}
