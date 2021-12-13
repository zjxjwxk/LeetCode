package com.zjxjwxk.leetcode._0807_Max_Increase_to_Keep_City_Skyline;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2021/12/13 17:08
 */
public class Solution {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length, ans = 0;
        int[] eastMax = new int[n];
        int[] southMax = new int[n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                eastMax[i] = Math.max(eastMax[i], grid[i][j]);
                southMax[j] = Math.max(southMax[j], grid[i][j]);
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                ans += Math.min(eastMax[i], southMax[j]) - grid[i][j];
            }
        }
        return ans;
    }
}
