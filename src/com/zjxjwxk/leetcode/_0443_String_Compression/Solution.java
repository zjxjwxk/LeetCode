package com.zjxjwxk.leetcode._0443_String_Compression;

/**
 * 三指针
 * @author Xinkang Wu
 * @date 2021/9/13 17:08
 */
public class Solution {

    public int compress(char[] chars) {
        int len = chars.length, i = 0, k = 0;
        for (int j = 1; j <= len; ++j) {
            if (j == len || chars[j] != chars[i]) {
                chars[k++] = chars[i];
                if (j - i > 1) {
                    char[] countChArr = String.valueOf(j - i).toCharArray();
                    for (char ch : countChArr) {
                        chars[k++] = ch;
                    }
                }
                i = j;
            }
        }
        return k;
    }
}
