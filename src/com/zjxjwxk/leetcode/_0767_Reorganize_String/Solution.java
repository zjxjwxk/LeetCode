package com.zjxjwxk.leetcode._0767_Reorganize_String;

import java.util.*;

/**
 * 基于最大堆的贪心算法
 * @author Xinkang Wu
 * @date 2020/11/30 11:13
 */
public class Solution {

    public String reorganizeString(String S) {
        int len = S.length(), maxCount = 0;
        int[] counts = new int[26];
        Queue<Character> maxHeap = new PriorityQueue<>((c1, c2) -> counts[c2 - 'a'] - counts[c1 - 'a']);
        for (int i = 0; i < len; ++i) {
            int index = S.charAt(i) - 'a';
            maxCount = Math.max(maxCount, ++counts[index]);
        }
        if (maxCount > ((len + 1) >> 1)) {
            return "";
        }
        for (int i = 0; i < 26; ++i) {
            if (counts[i] != 0) {
                maxHeap.add((char) (i + 'a'));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char ch1 = maxHeap.poll();
            --counts[ch1 - 'a'];
            sb.append(ch1);
            if (maxHeap.isEmpty()) {
                return sb.toString();
            }
            char ch2 = maxHeap.poll();
            --counts[ch2 - 'a'];
            sb.append(ch2);
            if (counts[ch1 - 'a'] != 0) {
                maxHeap.add(ch1);
            }
            if (counts[ch2 - 'a'] != 0) {
                maxHeap.add(ch2);
            }
        }
        return sb.toString();
    }
}
