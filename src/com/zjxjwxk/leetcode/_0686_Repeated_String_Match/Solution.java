package com.zjxjwxk.leetcode._0686_Repeated_String_Match;

/**
 * @author Xinkang Wu
 * @date 2021/12/22 12:36
 */
public class Solution {

    public int repeatedStringMatch(String a, String b) {
        int aLen = a.length(), bLen = b.length();
        int index = KMP(a.toCharArray(), b.toCharArray());
        if (index == -1) {
            return -1;
        }
        if (index + bLen < aLen) {
            return 1;
        }
        return (bLen + index - 1) / aLen + 1;
    }

    private int KMP(char[] aArr, char[] bArr) {
        int aLen = aArr.length, bLen = bArr.length;
        if (bLen == 0) {
            return 0;
        }
        int[] pi = new int[bLen];
        for (int i = 1, j = 0; i < bLen; ++i) {
            while (j > 0 && bArr[i] != bArr[j]) {
                j = pi[j - 1];
            }
            if (bArr[i] == bArr[j]) {
                pi[i] = ++j;
            }
        }
        for (int i = 0, j = 0; i - j < aLen; ++i) {
            while (j > 0 && aArr[i % aLen] != bArr[j]) {
                j = pi[j - 1];
            }
            if (aArr[i % aLen] == bArr[j]) {
                ++j;
                if (j == bLen) {
                    return i - j + 1;
                }
            }
        }
        return -1;
    }
}
