package com.zjxjwxk.leetcode._0012_Integer_to_Roman;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2021/5/16 22:37
 */
public class Solution {

    private static final char[][] ROMAN = {
            {'I', 'V'},
            {'X', 'L'},
            {'C', 'D'},
            {'M'}
    };

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int offset = 1000, digit;
        for (int i = 3; i >= 0; --i) {
            digit = (num / offset) % 10;
            if (digit >= 1 && digit <= 3) {
                for (int j = 0; j < digit; ++j) {
                    sb.append(ROMAN[i][0]);
                }
            } else if (digit == 4) {
                sb.append(ROMAN[i][0]).append(ROMAN[i][1]);
            } else if (digit >= 5 && digit <= 8) {
                sb.append(ROMAN[i][1]);
                for (int j = 0; j < digit - 5; ++j) {
                    sb.append(ROMAN[i][0]);
                }
            } else if (digit == 9) {
                for (int j = 0; j < 10 - digit; ++j) {
                    sb.append(ROMAN[i][0]);
                }
                sb.append(ROMAN[i + 1][0]);
            }
            offset /= 10;
        }
        return sb.toString();
    }
}
