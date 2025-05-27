package com.zjxjwxk.leetcode._0003_Longest_Substring_Without_Repeating_Characters;

/**
 * 滑动窗口（for+while）
 *
 * @author Xinkang Wu
 * @date 2025/5/27 21:25
 */
public class Solution4 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        boolean[] hashTable = new boolean[128];
        char[] chArr = s.toCharArray();
        int i = 0, ans = 0;
        for (int j = 0; j < chArr.length; ++j) {
            while (hashTable[chArr[j]]) {
                hashTable[chArr[i++]] = false;
            }
            hashTable[chArr[j]] = true;
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
