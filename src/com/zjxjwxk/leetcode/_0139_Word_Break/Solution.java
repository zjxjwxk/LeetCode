package com.zjxjwxk.leetcode._0139_Word_Break;

import java.util.*;

/**
 * @author Xinkang Wu
 * @date 2020/11/1 11:34 上午
 */
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int i = 1; i <= len; ++i) {
            for (int j = i - 1; j >= 0; --j) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
}
