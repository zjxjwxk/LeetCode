package com.zjxjwxk.leetcode._0067_Add_Binary;

/**
 * @author Xinkang Wu
 * @date 2023/8/15 16:07
 */
public class Solution {

    public String addBinary(String a, String b) {
        StringBuilder sb1 = new StringBuilder(a), sb2 = new StringBuilder(b), res = new StringBuilder();
        int len1 = sb1.length(), len2 = sb2.length(), maxLen = Math.max(len1, len2), carry = 0;
        for (int i = 0; i < maxLen; ++i) {
            int digit1 = i < len1 ? (sb1.charAt(len1 - 1 - i) - '0') : 0;
            int digit2 = i < len2 ? (sb2.charAt(len2 - 1 - i) - '0') : 0;
            int sum = digit1 + digit2 + carry;
            int digit = sum % 2;
            res.insert(0, (char) ('0' + digit));
            carry = sum / 2;
        }
        if (carry != 0) {
            res.insert(0, (char) ('0' + carry));
        }
        return res.toString();
    }
}
