package com.zjxjwxk.leetcode._0028_Implement_strStr;

/**
 * @author zjxjwxk
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length();
        char[] chArr1 = haystack.toCharArray(), chArr2 = needle.toCharArray();
        if (len2 == 0) {
            return 0;
        }
        if (len2 > len1) {
            return -1;
        }
        for (int i = 0; i < len1; ++i) {
            if (i + len2 > len1) {
                return -1;
            }
            int j;
            for (j = 0; j < len2; ++j) {
                if (chArr2[j] != chArr1[i + j]) {
                    break;
                }
            }
            if (j == len2) {
                return i;
            }
        }
        return -1;
    }
}
