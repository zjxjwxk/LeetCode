package com.zjxjwxk.leetcode._0067_Add_Binary;

/**
 * 模拟
 *
 * @author Xinkang Wu
 * @date 2026/3/3 10:34
 */
public class Solution2 {

    public String addBinary(String a, String b) {
        int carry = 0, i = a.length() - 1, j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0 && a.charAt(i) == '1') ? 1 : 0;
            int digit2 = (j >= 0 && b.charAt(j) == '1') ? 1 : 0;
            int sum = digit1 + digit2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
            --i;
            --j;
        }
        return sb.reverse().toString();
    }
}
