package com.zjxjwxk.leetcode._0482_License_Key_Formatting;

/**
 * 从后往前拼接
 * @author Xinkang Wu
 * @date 2021/10/4 13:30
 */
public class Solution2 {

    public String licenseKeyFormatting(String s, int k) {
        char[] chArr = s.toCharArray();
        int len = chArr.length, count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = len - 1; i >= 0; --i) {
            char ch = chArr[i];
            if (ch != '-') {
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 'a' + 'A');
                }
                sb.append(ch);
                ++count;
                if (count == k) {
                    sb.append('-');
                    count = 0;
                }
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.reverse().toString();
    }
}
