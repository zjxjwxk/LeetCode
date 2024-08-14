package com.zjxjwxk.leetcode._3152_Special_Array_II;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2024/8/14 22:48
 */
public class Solution {

    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length, m = queries.length;
        boolean[] ans = new boolean[m];
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; ++i) {
            if (((nums[i] ^ nums[i - 1]) & 1) == 1) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
        }
        for (int index = 0; index < m; ++index) {
            int[] query = queries[index];
            int i = query[0], j = query[1];
            ans[index] = j - i + 1 <= dp[j];
        }
        return ans;
    }
}
