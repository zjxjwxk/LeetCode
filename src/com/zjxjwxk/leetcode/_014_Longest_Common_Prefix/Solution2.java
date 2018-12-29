package com.zjxjwxk.leetcode._014_Longest_Common_Prefix;

/**
 * @author zjxjwxk
 */
public class Solution2 {

    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) {
            return "";
        }
        int minLen = 0x7fffffff;
        for (String str :
                strs) {
            minLen = Math.min(minLen, str.length());
        }
        for (int j = 0; j < minLen; j++) {
            for (int i = 1; i < len; i++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0].substring(0, minLen);
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }
}