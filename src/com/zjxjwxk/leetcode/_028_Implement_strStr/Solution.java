package com.zjxjwxk.leetcode._028_Implement_strStr;

/**
 * 暴力匹配算法
 * @author zjxjwxk
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len2 == 0) {
            return 0;
        }
        if (len1 < len2) {
            return -1;
        }
        for (int i = 0; i < len1; i++) {
            if (i + len2 > len1) {
                return -1;
            }
            for (int j = 0; j < len2; j++) {
                if (haystack.charAt(i + j) == needle.charAt(j)) {
                    if (j == len2 - 1) {
                        return i;
                    }
                } else {
                    break;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        Solution solution = new Solution();
        int i = solution.strStr(haystack, needle);
        System.out.println("Index : " + i);
    }
}
