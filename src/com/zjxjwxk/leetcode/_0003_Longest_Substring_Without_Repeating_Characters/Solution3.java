package com.zjxjwxk.leetcode._0003_Longest_Substring_Without_Repeating_Characters;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2023/12/15 00:01
 */
public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        boolean[] hashTable = new boolean[128];
        int maxLen = 0, i = 0, j = 0, len = s.length();
        char[] chArr = s.toCharArray();
        while (j < len) {
            while (j < len && !hashTable[chArr[j]]) {
                hashTable[chArr[j]] = true;
                ++j;
            }
            maxLen = Math.max(maxLen, j - i);
            while (j < len && i < j && chArr[i] != chArr[j]) {
                hashTable[chArr[i]] = false;
                ++i;
            }
            if (i < len) {
                hashTable[chArr[i++]] = false;
            }
        }
        return maxLen;
    }
}
