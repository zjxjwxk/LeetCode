package com.zjxjwxk.leetcode._0076_Minimum_Window_Substring;

import java.util.HashMap;
import java.util.Map;

/**
 * 滑动窗口（差别哈希表）
 *
 * @author Xinkang Wu
 * @date 2025/10/21 23:07
 */
public class Solution2 {

    public String minWindow(String s, String t) {
        // 表示当前滑动窗口中，相对 t 字符串相差的各字符个数，正数代表该字符有余，负数代表该字符有少
        Map<Character, Integer> diffMap = new HashMap<>();
        // 初始化 diffMap，统计相对 t 字符串缺少的各字符个数
        for (int i = 0; i < t.length(); ++i) {
            char ch = t.charAt(i);
            diffMap.put(ch, diffMap.getOrDefault(ch, 0) - 1);
        }
        // totalDiff 表示当前相对 t 字符串的总缺少字符数
        int i = 0, totalDiff = t.length(), minLeft = 0, minLen = Integer.MAX_VALUE;
        for (int j = 0; j < s.length(); ++j) {
            // 遍历 s 字符串中的字符，将其字符个数 + 1
            char ch = s.charAt(j);
            Integer diff = diffMap.getOrDefault(ch, 0);
            diffMap.put(ch, diff + 1);
            // 若当前字符在 + 1 前处于缺少状态，则总缺少字符数 - 1
            if (diff < 0) {
                --totalDiff;
            }
            // 当总缺少字符数为 0 时，开始尝试右移左边界，并更新字符数，直至遍历至左边界的字符数为 0，则无法再减少字符
            if (totalDiff == 0) {
                while ((diff = diffMap.get((ch = s.charAt(i)))) > 0) {
                    diffMap.put(ch, diff - 1);
                    ++i;
                }
                // 更新最小子串
                int len = j - i + 1;
                if (len < minLen) {
                    minLen = len;
                    minLeft = i;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}
