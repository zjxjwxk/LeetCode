package com.zjxjwxk.leetcode._0787_Cheapest_Flights_Within_K_Stops;

import java.util.Arrays;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/9/14 23:13
 */
public class Solution {

    public static final int INF = 1000001;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, INF);
        dp[src] = 0;
        int ans = INF;
        for (int i = 1; i <= k + 1; ++i) {
            int[] dpNew = new int[n];
            Arrays.fill(dpNew, INF);
            for (int[] flight : flights) {
                dpNew[flight[1]] = Math.min(dpNew[flight[1]], dp[flight[0]] + flight[2]);
            }
            dp = dpNew;
            ans = Math.min(ans, dp[dst]);
        }
        return ans < INF ? ans : -1;
    }
}
