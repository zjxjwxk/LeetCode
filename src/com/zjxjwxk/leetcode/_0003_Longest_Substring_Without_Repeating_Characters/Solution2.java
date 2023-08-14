package com.zjxjwxk.leetcode._0003_Longest_Substring_Without_Repeating_Characters;

import java.util.HashMap;
import java.util.Map;

/**
 * 滑动窗口+哈希表
 * @author Xinkang Wu
 * @date 2023/8/14 15:19
 */
public class Solution2 {

    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLen = 0;
        Map<Character, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (indexMap.containsKey(ch)) {
                left = Math.max(left, indexMap.get(ch) + 1);
            }
            maxLen = Math.max(maxLen, i - left + 1);
            indexMap.put(ch, i);
        }
        return maxLen;
    }
}
