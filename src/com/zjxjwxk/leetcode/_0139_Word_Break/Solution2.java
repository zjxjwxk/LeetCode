package com.zjxjwxk.leetcode._0139_Word_Break;

import java.util.List;

public class Solution2 {
    
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int curLen = 1; curLen <= len; ++curLen) {
            for (String word : wordDict) {
                int wordLen = word.length();
                if (wordLen <= curLen && s.substring(curLen - wordLen, curLen).equals(word) && dp[curLen - wordLen]) {
                    dp[curLen] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
}
