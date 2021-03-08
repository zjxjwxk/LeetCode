package com.zjxjwxk.leetcode._0131_Palindrome_Partitioning;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯+动态规划
 * @author Xinkang Wu
 * @date 2021/3/8 13:56
 */
public class Solution {

    public List<List<String>> partition(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int len = 1; len <= n; ++len) {
            for (int i = 0; i + len - 1 < n; ++i) {
                int j = i + len - 1;
                if (len == 1) {
                    dp[i][j] = true;
                } else if (len == 2) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }
            }
        }
        List<List<String>> ans = new ArrayList<>();
        dfs(dp, 0, s, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(boolean[][] dp, int left, String s, List<String> list, List<List<String>> ans) {
        if (left == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = left; i < s.length(); ++i) {
            if (dp[left][i]) {
                list.add(s.substring(left, i + 1));
                dfs(dp, i + 1, s, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
}
