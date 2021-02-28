package com.zjxjwxk.leetcode._0395_Longest_Substring_with_At_Least_K_Repeating_Characters;

/**
 * 分治
 * @author Xinkang Wu
 * @date 2021/2/27 23:29
 */
public class Solution {

    public int longestSubstring(String s, int k) {
        return dfs(s, 0, s.length() - 1, k);
    }

    private int dfs(String s, int left, int right, int k) {
        int[] count = new int[26];
        for (int i = left; i <= right; ++i) {
            ++count[s.charAt(i) - 'a'];
        }
        char split = 0;
        for (int i = 0; i < 26; ++i) {
            if (count[i] > 0 && count[i] < k) {
                split = (char) (i + 'a');
                break;
            }
        }
        if (split == 0) {
            return right - left + 1;
        }
        int i = left, maxLen = 0;
        while (i <= right) {
            while (i <= right && s.charAt(i) == split) {
                ++i;
            }
            if (i > right) {
                break;
            }
            int nextLeft = i;
            while (i <= right && s.charAt(i) != split) {
                ++i;
            }
            maxLen = Math.max(maxLen, dfs(s, nextLeft, i - 1, k));
        }
        return maxLen;
    }
}
