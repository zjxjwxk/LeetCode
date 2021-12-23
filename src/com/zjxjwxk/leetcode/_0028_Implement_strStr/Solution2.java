package com.zjxjwxk.leetcode._0028_Implement_strStr;

/**
 * @author zjxjwxk
 */
public class Solution2 {

    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length();
        char[] chArr1 = haystack.toCharArray(), chArr2 = needle.toCharArray();
        if (len2 == 0) {
            return 0;
        }
        if (len2 > len1) {
            return -1;
        }
        int[] prefixSuffixSameLens = new int[len2];
        for (int i = 1, j = 0; i < len2; ++i) {
            while (j > 0 && chArr2[i] != chArr2[j]) {
                j = prefixSuffixSameLens[j - 1];
            }
            if (chArr2[i] == chArr2[j]) {
                prefixSuffixSameLens[i] = ++j;
            }
        }
        for (int i = 0, j = 0; i < len1; ++i) {
            while (j > 0 && chArr1[i] != chArr2[j]) {
                j = prefixSuffixSameLens[j - 1];
            }
            if (chArr1[i] == chArr2[j]) {
                ++j;
                if (j == len2) {
                    return i - len2 + 1;
                }
            }
        }
        return -1;
    }
}
