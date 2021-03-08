package com.zjxjwxk.leetcode._0005_Longest_Palindromic_Substring;

/**
 * 中心扩展法
 * @author Xinkang Wu
 * @date 2021/3/8 13:29
 */
public class Solution2 {

    public String longestPalindrome(String s) {
        int len = s.length();
        String ans = "";
        for (int i = 0; i < len; ++i) {
            String s1 = expand(s, i, i);
            String s2 = expand(s, i, i + 1);
            if (s1.length() > ans.length()) {
                ans = s1;
            }
            if (s2.length() > ans.length()) {
                ans = s2;
            }
        }
        return ans;
    }

    private String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return s.substring(left + 1, right);
    }
}
