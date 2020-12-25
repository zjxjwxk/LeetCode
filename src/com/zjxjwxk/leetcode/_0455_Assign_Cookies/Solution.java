package com.zjxjwxk.leetcode._0455_Assign_Cookies;

import java.util.Arrays;

/**
 * 排序+贪心
 * @author Xinkang Wu
 * @date 2020/12/25 22:32
 */
public class Solution {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < s.length && j < g.length) {
            if (s[i] >= g[j]) {
                ++i;
                ++j;
            } else {
                ++i;
            }
        }
        return j;
    }
}
