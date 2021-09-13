package com.zjxjwxk.leetcode._0541_Reverse_String_II;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2021/9/13 15:30
 */
public class Solution {

    public String reverseStr(String s, int k) {
        char[] chArr = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i += (k << 1)) {
            reverse(chArr, i, Math.min(i + k - 1, len - 1));
        }
        return new String(chArr);
    }

    private void reverse(char[] chArr, int left, int right) {
        int len = right - left + 1;
        for (int i = 0; i < (len >> 1); ++i) {
            swap(chArr, left + i, right - i);
        }
    }

    private void swap(char[] chArr, int index1, int index2) {
        char temp = chArr[index1];
        chArr[index1] = chArr[index2];
        chArr[index2] = temp;
    }
}
