package com.zjxjwxk.leetcode._1370_Increasing_Decreasing_String;

/**
 * 桶排序
 * @author Xinkang Wu
 * @date 2020/11/25 13:30
 */
public class Solution {

    public String sortString(String s) {
        int len = s.length();
        int[] counts = new int[26];
        for (int i = 0; i < len; ++i) {
            ++counts[s.charAt(i) - 'a'];
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int i = 0; i < 26; ++i) {
                if (counts[i] > 0) {
                    --counts[i];
                    sb.append((char) ('a' + i));
                }
            }
            for (int i = 25; i >= 0; --i) {
                if (counts[i] > 0) {
                    --counts[i];
                    sb.append((char) ('a' + i));
                }
            }
        }
        return sb.toString();
    }
}
