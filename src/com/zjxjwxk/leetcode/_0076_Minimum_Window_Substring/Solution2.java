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
        // totalDiff 表示当前相对 t 字符串的总缺少字符数，负数代表缺少
        int sLen = s.length(), tLen = t.length(), totalDiff = -tLen;
        // 初始化 diffMap，统计相对 t 字符串缺少的各字符个数
        for (int i = 0; i < tLen; ++i) {
            char tChar = t.charAt(i);
            diffMap.put(tChar, diffMap.getOrDefault(tChar, 0) - 1);
        }
        int left = 0, minLen = Integer.MAX_VALUE;
        String minSubstring = "";
        // 滑动窗口，先移动右指针
        for (int right = 0; right < sLen; ++right) {
            char rightChar = s.charAt(right);
            Integer rightDiff = diffMap.get(rightChar);
            // 跳过不存在 t 字符串中的字符
            if (rightDiff == null) {
                continue;
            }
            // 更新右字符 diff
            diffMap.put(rightChar, rightDiff + 1);
            // 若当前右字符在 + 1 前处于缺少状态，则总缺少字符数 + 1
            if (rightDiff < 0) {
                ++totalDiff;
            }
            char leftChar;
            Integer leftDiff;
            // 后移动左指针
            while (left < right) {
                leftChar = s.charAt(left);
                leftDiff = diffMap.get(leftChar);
                // 跳过不存在 t 字符串中的字符
                if (leftDiff == null) {
                    ++left;
                    continue;
                }
                // 若当前左字符正缺少，停止移动左指针
                if (leftDiff <= 0) {
                    break;
                }
                // 否则表示左字符有余，更新左字符 diff，并移动左指针
                diffMap.put(leftChar, leftDiff - 1);
                ++left;
            }
            // 左右指针移动完毕，当总缺少字符数为 0 时，更新最优解
            if (totalDiff == 0) {
                int windowLen = right - left + 1;
                if (windowLen < minLen) {
                    minLen = windowLen;
                    minSubstring = s.substring(left, left + windowLen);
                }
            }
        }
        return minSubstring;
    }
}
