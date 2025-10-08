package com.zjxjwxk.leetcode._0014_Longest_Common_Prefix;

/**
 * 纵向扫描
 *
 * @author zjxjwxk
 */
public class Solution2 {

    public String longestCommonPrefix(String[] strs) {
        int n = strs.length, len = strs[0].length();
        for (int i = 0; i < len; ++i) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < n; ++j) {
                if (i == strs[j].length() || ch != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}