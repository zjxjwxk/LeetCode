package com.zjxjwxk.leetcode._0003_Longest_Substring_Without_Repeating_Characters;

/**
 * 滑动窗口
 * @author zjxjwxk
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int len = s.length(), maxLen = 0, startIndex = 0, endIndex = 0;
        boolean[] hashTable = new boolean[128];
        while (startIndex < len && endIndex < len) {
            while (endIndex < len && !hashTable[s.charAt(endIndex)]) {
                hashTable[s.charAt(endIndex)] = true;
                ++endIndex;
            }
            maxLen = Math.max(maxLen, endIndex - startIndex);
            hashTable[s.charAt(startIndex)] = false;
            ++startIndex;
        }
        return maxLen;
    }
}
