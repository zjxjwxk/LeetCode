package com.zjxjwxk.leetcode._0482_License_Key_Formatting;

/**
 * 从前往后拼接
 * @author Xinkang Wu
 * @date 2021/10/4 13:30
 */
public class Solution {

    public String licenseKeyFormatting(String s, int k) {
        char[] chArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chArr) {
            if (ch != '-') {
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 'a' + 'A');
                }
                sb.append(ch);
            }
        }
        int count = sb.length(), firstNum = count % k;
        if (count < k) {
            return sb.toString();
        }
        for (int i = firstNum != 0 ? firstNum : k; i < sb.length(); i += (k + 1)) {
            sb.insert(i, '-');
        }
        return sb.toString();
    }
}
