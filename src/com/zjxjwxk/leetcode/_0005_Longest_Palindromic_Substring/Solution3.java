package com.zjxjwxk.leetcode._0005_Longest_Palindromic_Substring;

/**
 * 中心扩展法
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * @author Xinkang Wu
 * @date 2021/3/8 13:29
 */
public class Solution3 {

    public String longestPalindrome(String s) {
        int len = s.length(), begin = 0, maxLen = 1;
        char[] chArr = s.toCharArray();
        for (int i = 0; i < len; ++i) {
            int len1 = expand(chArr, i, i);
            int len2 = expand(chArr, i, i + 1);
            int largerLen = Math.max(len1, len2);
            if (largerLen > maxLen) {
                begin = i - ((largerLen - 1) >> 1);
                maxLen = largerLen;
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    private int expand(char[] chArr, int left, int right) {
        while (left >= 0 && right < chArr.length && chArr[left] == chArr[right]) {
            --left;
            ++right;
        }
        return right - left - 1;
    }
}
