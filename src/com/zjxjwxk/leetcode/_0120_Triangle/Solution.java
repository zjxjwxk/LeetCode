package com.zjxjwxk.leetcode._0120_Triangle;

import java.util.List;

/**
 * 动态规划
 *
 * @author Xinkang Wu
 * @date 2026/3/10 00:13
 */
public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; --i) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < i + 1; ++j) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + row.get(j);
            }
        }
        return dp[0];
    }
}
