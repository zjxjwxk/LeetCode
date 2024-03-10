package com.zjxjwxk.leetcode._0008_String_to_Integer_atoi;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2024/3/11 00:56
 */
public class Solution {

    public int myAtoi(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int i = 0, num = 0;
        while (i < len && chars[i] == ' ') {
            ++i;
        }
        if (i == len) {
            return 0;
        }
        boolean negative = false;
        if (chars[i] == '-') {
            negative = true;
            ++i;
        } else if (chars[i] == '+') {
            ++i;
        }
        while (i < len && chars[i] >= '0' && chars[i] <= '9') {
            int digit = chars[i] - '0';
            if (!negative && num > ((Integer.MAX_VALUE - digit) / 10)) {
                return Integer.MAX_VALUE;
            }
            if (negative && (-num) < ((Integer.MIN_VALUE + digit) / 10)) {
                return Integer.MIN_VALUE;
            }
            num = num * 10 + (chars[i] - '0');
            ++i;
        }
        if (negative) {
            return -num;
        }
        return num;
    }
}
