package com.zjxjwxk.leetcode._0076_Minimum_Window_Substring;

import java.util.HashMap;
import java.util.Map;

/**
 * 滑动窗口（无优化）
 *
 * @author Xinkang Wu
 * @date 2026/1/7 20:35
 */
public class Solution3 {

    public String minWindow(String s, String t) {
        Map<Character, Integer> sCountMap = new HashMap<>();
        Map<Character, Integer> tCountMap = new HashMap<>();
        int sLen = s.length(), tLen = t.length(), i = 0, minLen = Integer.MAX_VALUE;
        String minSubstring = "";
        for (int j = 0; j < tLen; ++j) {
            tCountMap.merge(t.charAt(j), 1, Integer::sum);
        }
        for (int j = 0; j < sLen; ++j) {
            sCountMap.merge(s.charAt(j), 1, Integer::sum);
            char leftChar;
            int leftCount;
            while (i < j && (leftCount = sCountMap.get(leftChar = s.charAt(i))) > tCountMap.getOrDefault(leftChar, 0)) {
                sCountMap.put(leftChar, leftCount - 1);
                ++i;
            }
            if (coverString(sCountMap, tCountMap)) {
                int windowLen = j - i + 1;
                if (windowLen < minLen) {
                    minLen = windowLen;
                    minSubstring = s.substring(i, i + windowLen);
                }
            }
        }
        return minSubstring;
    }

    private boolean coverString(Map<Character, Integer> sCountMap, Map<Character, Integer> tCountMap) {
        for (Map.Entry<Character, Integer> tEntry : tCountMap.entrySet()) {
            char tChar = tEntry.getKey();
            int tCount = tEntry.getValue();
            if (sCountMap.getOrDefault(tChar, 0) < tCount) {
                return false;
            }
        }
        return true;
    }
}
