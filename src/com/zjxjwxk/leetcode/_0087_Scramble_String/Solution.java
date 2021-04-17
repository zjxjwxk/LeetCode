package com.zjxjwxk.leetcode._0087_Scramble_String;

/**
 * 记忆化搜索
 * @author Xinkang Wu
 * @date 2021/4/16 22:03
 */
public class Solution {

    public boolean isScramble(String s1, String s2) {
        int len = s1.length();
        int[][][] dp = new int[len][len][len + 1];
        return dfs(s1.toCharArray(), 0, s2.toCharArray(), 0, len, dp);
    }

    private boolean dfs(char[] s1, int index1, char[] s2, int index2, int len, int[][][] dp) {
        // 已经搜索过
        if (dp[index1][index2][len] != 0) {
            return dp[index1][index2][len] == 1;
        }
        // 判断是否相等
        boolean ifEqual = true;
        for (int i = 0; i < len; ++i) {
            if (s1[index1 + i] != s2[index2 + i]) {
                ifEqual = false;
                break;
            }
        }
        if (ifEqual) {
            dp[index1][index2][len] = 1;
            return true;
        }
        // 判断是否字符个数不同
        int[] count = new int[26];
        for (int i = index1; i < index1 + len; ++i) {
            ++count[s1[i] - 'a'];
        }
        for (int i = index2; i < index2 + len; ++i) {
            if (--count[s2[i] - 'a'] < 0) {
                dp[index1][index2][len] = -1;
                return false;
            }
        }
        // 向下递归
        for (int i = 1; i <= len - 1; ++i) {
            if (dfs(s1, index1, s2, index2, i, dp) && dfs(s1, index1 + i, s2, index2 + i, len - i, dp)
                    || dfs(s1, index1, s2, index2 + len - i, i, dp) && dfs(s1, index1 + i, s2, index2, len - i, dp)) {
                dp[index1][index2][len] = 1;
                return true;
            }
        }
        dp[index1][index2][len] = -1;
        return false;
    }
}
