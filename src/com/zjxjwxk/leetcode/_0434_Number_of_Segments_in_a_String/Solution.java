package com.zjxjwxk.leetcode._0434_Number_of_Segments_in_a_String;

/**
 * 原地法
 * @author Xinkang Wu
 * @date 2021/10/7 11:18
 */
public class Solution {

    public int countSegments(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        final char space = ' ';
        char[] chars = s.toCharArray();
        int count = 0;
        if (chars[0] != space) {
            ++count;
        }
        for (int i = 1; i < len; ++i) {
            if (chars[i - 1] == space && chars[i] != space) {
                ++count;
            }
        }
        return count;
    }
}
