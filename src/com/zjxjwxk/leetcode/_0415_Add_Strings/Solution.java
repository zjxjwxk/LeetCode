package com.zjxjwxk.leetcode._0415_Add_Strings;

/**
 * 模拟
 *
 * @author Xinkang Wu
 * @date 2025/11/14 20:37
 */
public class Solution {

    public String addStrings(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length(), i = len1 - 1, j = len2 - 1, carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int digitSum = digit1 + digit2 + carry;
            carry = digitSum / 10;
            sb.append((char) ('0' + digitSum % 10));
        }
        return sb.reverse().toString();
    }
}
