package com.zjxjwxk.leetcode._0062_Unique_Paths;

/**
 * 排列组合
 * (m + n - 2)! / [(m - 1)! * (n - 1)!] = [(m + n - 2) * (m + n - 1) * ... * n] / (m - 1)!
 * @author Xinkang Wu
 * @date 2020/12/10 09:29
 */
public class Solution2 {

    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int x = n, y = 1; y <= m - 1; ++x, ++y) {
            ans = ans * x / y;
        }
        return (int) ans;
    }
}
