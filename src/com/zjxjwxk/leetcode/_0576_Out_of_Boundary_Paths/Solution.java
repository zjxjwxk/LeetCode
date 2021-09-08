package com.zjxjwxk.leetcode._0576_Out_of_Boundary_Paths;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/9/8 15:58
 */
public class Solution {

    private static final int MOD = 1000000007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][] dp = new int[m][n];
        int[][] directions = {
                {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };
        dp[startRow][startColumn] = 1;
        int ans = 0;
        for (int i = 0; i < maxMove; ++i) {
            int[][] nextDp = new int[m][n];
            for (int j = 0; j < m; ++j) {
                for (int k = 0; k < n; ++k) {
                    int count = dp[j][k];
                    if (count > 0) {
                        for (int[] direction : directions) {
                            int nextJ = j + direction[0], nextK = k + direction[1];
                            if (nextJ >= 0 && nextJ < m && nextK >= 0 && nextK < n) {
                                nextDp[nextJ][nextK] = (nextDp[nextJ][nextK] + count) % MOD;
                            } else {
                                ans = (ans + count) % MOD;
                            }
                        }
                    }
                }
            }
            dp = nextDp;
        }
        return ans;
    }
}
