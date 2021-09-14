package com.zjxjwxk.leetcode._0524_Longest_Word_in_Dictionary_through_Deleting;

import java.util.Arrays;
import java.util.List;

/**
 * 动态规划 + 排序
 * @author Xinkang Wu
 * @date 2021/9/14 09:59
 */
public class Solution2 {

    public String findLongestWord(String s, List<String> dictionary) {
        int len = s.length();
        char[] chArr = s.toCharArray();
        int[][] dp = new int[len + 1][26];
        Arrays.fill(dp[len], len);
        for (int i = len - 1; i >= 0; --i) {
            for (int j = 0; j < 26; ++j) {
                if (chArr[i] == 'a' + j) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        dictionary.sort((dict1, dict2) -> {
            if (dict1.length() != dict2.length()) {
                return dict2.length() - dict1.length();
            } else {
                return dict1.compareTo(dict2);
            }
        });
        for (String dict : dictionary) {
            int index = 0;
            for (int i = 0; i < dict.length(); ++i) {
                index = dp[index][dict.charAt(i) - 'a'] + 1;
                if (index == len + 1) {
                    break;
                }
            }
            if (index <= len) {
                return dict;
            }
        }
        return "";
    }
}
