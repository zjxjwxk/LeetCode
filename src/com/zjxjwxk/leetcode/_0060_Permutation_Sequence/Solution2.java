package com.zjxjwxk.leetcode._0060_Permutation_Sequence;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2022/1/9 17:12
 */
public class Solution2 {

    public String getPermutation(int n, int k) {
        int factorial = 1;
        for (int i = n; i >= 1; --i) {
            factorial *= i;
        }
        boolean[] vis = new boolean[n + 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; ++i) {
            factorial /= (n - i + 1);
            int order = (k - 1) / factorial + 1;
            for (int j = 1; j <= n; ++j) {
                if (!vis[j]) {
                    if (--order == 0) {
                        vis[j] = true;
                        sb.append((char) ('0' + j));
                        break;
                    }
                }
            }
            k = (k - 1) % factorial + 1;
        }
        return sb.toString();
    }
}
