package com.zjxjwxk.leetcode._0392_Is_Subsequence;

/**
 * 双指针+贪心
 *
 * @author Xinkang Wu
 * @date 2025/10/14 23:44
 */
public class Solution {

    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                ++i;
            }
            ++j;
        }
        return i == s.length();
    }
}
