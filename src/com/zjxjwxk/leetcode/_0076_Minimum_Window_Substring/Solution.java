package com.zjxjwxk.leetcode._0076_Minimum_Window_Substring;

import java.util.HashMap;
import java.util.Map;

/**
 * 滑动窗口
 *
 * @author Xinkang Wu
 * @date 2025/6/2 00:12
 */
public class Solution {

    public String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            return "";
        }
        Map<Character, Integer> tCountMap = new HashMap<>();
        Map<Character, Integer> sCountMap = new HashMap<>();
        for (int i = 0; i < t.length(); ++i) {
            tCountMap.merge(t.charAt(i), 1, Integer::sum);
        }
        int diff = tCountMap.size(), minBegin = -1, minLen = Integer.MAX_VALUE;
        for (int left = 0, right = 0; right < s.length(); ++right) {
            char rightChar = s.charAt(right);
            if (!tCountMap.containsKey(rightChar)) {
                continue;
            }
            int tRightCount = tCountMap.get(rightChar);
            int sRightCount = sCountMap.getOrDefault(rightChar, 0) + 1;
            sCountMap.put(rightChar, sRightCount);
            if (sRightCount == tRightCount) {
                --diff;
            }
            if (diff == 0) {
                while (diff == 0) {
                    char leftChar = s.charAt(left);
                    if (!tCountMap.containsKey(leftChar)) {
                        ++left;
                        continue;
                    }
                    int tLeftCount = tCountMap.get(leftChar);
                    int sLeftCount = sCountMap.get(leftChar) - 1;
                    sCountMap.put(leftChar, sLeftCount);
                    if (sLeftCount == tLeftCount - 1) {
                        ++diff;
                    }
                    ++left;
                }
                int len = right - left + 2;
                if (len < minLen) {
                    minBegin = left - 1;
                    minLen = len;
                }
            }
        }
        return minBegin == -1 ? "" : s.substring(minBegin, minBegin + minLen);
    }
}
